package com.tfy.wlwztfy.biz.tfy;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.reflect.TypeToken;
import com.tfy.wlwztfy.R;
import com.tfy.wlwztfy.base.BaseActivity;
import com.tfy.wlwztfy.base.BaseRecyclerAdapter;
import com.tfy.wlwztfy.base.BaseRecyclerViewHolder;
import com.tfy.wlwztfy.bean.QaADto;
import com.tfy.wlwztfy.json.QAAJSON;
import com.tfy.wlwztfy.sp.CacheSPManager;
import com.tfy.wlwztfy.utils.EntitySerializer;
import com.xzq.divider.Divider;

import java.util.ArrayList;
import java.util.List;

public class ViewQuestionActivity extends BaseActivity implements TextWatcher {

    public static void start(Context context) {
        Intent starter = new Intent(context, ViewQuestionActivity.class);
        context.startActivity(starter);
    }

    private EditText edtKeyword;
    private MyAdapter myAdapter = new MyAdapter();

    @Override
    protected int getLayoutId() {
        return R.layout.activity_view_question;
    }

    @Override
    protected void initViews(@Nullable Bundle savedInstanceState) {

        initToolbar("看题找题", "添加");

        edtKeyword = findViewById(R.id.edt_keyword);
        edtKeyword.addTextChangedListener(this);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myAdapter);
        recyclerView.addItemDecoration(Divider.create(this));

        List<QaADto> cacheList = CacheSPManager.getQaList(this);

        if (cacheList == null || cacheList.isEmpty()) {

            try {
                list = EntitySerializer.deserializerType(QAAJSON.VALUE,
                        new TypeToken<List<QaADto>>() {
                        }.getType());
                CacheSPManager.putQaList(this, list);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {

            list.addAll(cacheList);

        }

        myAdapter.setData(list);
    }

    @Override
    protected void onRightIconTextClick() {
        id = -1;
        DetailActivity.start(this, null, null);
    }

    @Override
    protected void onAlertDialogPositiveButtonClick() {
        super.onAlertDialogPositiveButtonClick();
        for (int i = 0; i < myAdapter.getData().size(); i++) {
            QaADto dto = myAdapter.getData().get(i);
            if (dto.id == id) {
                myAdapter.getData().remove(i);
                break;
            }
        }
        myAdapter.notifyDataSetChanged();
        for (int i = 0; i < list.size(); i++) {
            QaADto dto = list.get(i);
            if (dto.id == id) {
                list.remove(i);
                break;
            }
        }
        CacheSPManager.putQaList(this, list);
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        myAdapter.setData(query(s.toString()));
    }

    private List<QaADto> list = new ArrayList<>();

    private List<QaADto> query(String keyword) {
        List<QaADto> result = new ArrayList<>();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                QaADto dto = list.get(i);
                if (dto.getQueryStr().contains(keyword)) {
                    result.add(dto);
                }
            }
        }
        return result;
    }

    private final class MyAdapter extends BaseRecyclerAdapter<QaADto, MyViewHolder> {

        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, @Nullable View itemView, int viewType) {
            return new MyViewHolder(itemView);
        }

        @Override
        protected int getItemLayoutId(int viewType) {
            return R.layout.item_qaa;
        }

        @Override
        public void onConvert(@NonNull MyViewHolder holder, QaADto data, int position, @NonNull List<Object> payload) {
            holder.setData(getDataAt(position));
        }
    }

    private final class MyViewHolder extends BaseRecyclerViewHolder<QaADto> implements View.OnClickListener, View.OnLongClickListener {

        private final TextView tvItem;

        MyViewHolder(View itemView) {
            super(itemView);
            tvItem = itemView.findViewById(R.id.tv_item);
            tvItem.setOnClickListener(this);
            tvItem.setOnLongClickListener(this);
        }

        @Override
        public void setData(QaADto data) {
            data.setText(tvItem);
        }

        @Override
        public void onClick(View v) {
            if (data != null) {
                DetailActivity.start(ViewQuestionActivity.this, data.question, data.answer);
                id = data.id;
            }
        }

        @Override
        public boolean onLongClick(View v) {
            if (data == null)
                return false;
            id = data.id;
            showDeleteAlertDialog();
            return true;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 88 && resultCode == RESULT_OK && data != null) {
            String question = data.getStringExtra("question");
            String answer = data.getStringExtra("answer");
            QaADto newDto = new QaADto();
            newDto.question = question;
            newDto.answer = answer;
            if (id == -1) {
                newDto.id = list.size();
                list.add(0, newDto);
                edtKeyword.setText(null);
            } else {
                QaADto dto = getDataById(list, id);
                if (dto != null) {
                    dto.question = question;
                    dto.answer = answer;
                }
                dto = getDataById(myAdapter.getData(), id);
                if (dto != null) {
                    dto.question = question;
                    dto.answer = answer;
                }
                myAdapter.notifyDataSetChanged();
            }

            CacheSPManager.putQaList(this, list);
        }
    }

    private int id = -1;

    private QaADto getDataById(List<QaADto> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            QaADto dto = list.get(i);
            if (id == dto.id) {
                return dto;
            }
        }
        return null;
    }
}

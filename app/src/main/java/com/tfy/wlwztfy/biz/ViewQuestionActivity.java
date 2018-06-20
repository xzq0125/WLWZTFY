package com.tfy.wlwztfy.biz;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.reflect.TypeToken;
import com.tfy.wlwztfy.R;
import com.tfy.wlwztfy.base.BaseListAdapter;
import com.tfy.wlwztfy.base.BaseListViewHolder;
import com.tfy.wlwztfy.bean.QaADto;
import com.tfy.wlwztfy.json.QAAJSON;
import com.tfy.wlwztfy.utils.EntitySerializer;

import java.util.ArrayList;
import java.util.List;

public class ViewQuestionActivity extends AppCompatActivity implements TextWatcher {

    public static void start(Context context) {
        Intent starter = new Intent(context, ViewQuestionActivity.class);
        context.startActivity(starter);
    }

    private EditText edtKeyword;
    private MyAdapter myAdapter = new MyAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_question);

        edtKeyword = findViewById(R.id.edt_keyword);
        edtKeyword.addTextChangedListener(this);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myAdapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        try {
            list = EntitySerializer.deserializerType(QAAJSON.VALUE,
                    new TypeToken<List<QaADto>>() {
                    }.getType());
            myAdapter.setData(list);
        } catch (Exception e) {
            e.printStackTrace();
        }

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

    private List<QaADto> list;

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

    private final class MyAdapter extends BaseListAdapter<QaADto, MyViewHolder> {

        @Override
        public MyViewHolder onCreateViewHolder(View itemView) {
            return new MyViewHolder(itemView);
        }

        @Override
        protected int getItemLayoutId() {
            return R.layout.item_qaa;
        }

        @Override
        public void onConvert(MyViewHolder holder, int position, List<Object> payload) {
            holder.setData(getDataAt(position));
        }
    }

    private final class MyViewHolder extends BaseListViewHolder<QaADto> {

        private final TextView tvItem;

        MyViewHolder(View itemView) {
            super(itemView);
            tvItem = itemView.findViewById(R.id.tv_item);
        }

        @Override
        public void setData(QaADto data) {
            data.setText(tvItem);
        }
    }
}

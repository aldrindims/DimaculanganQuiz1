package com.example.dimaculangan.dimaculanganquiz1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Aldrin on 28/09/2017.
 */

public class CustomAdapter extends BaseAdapter{
    Context myContext;
    private List<CodeName> codename;
    TextView tv_CodeName;
    ImageView iv_Logo;

    public CustomAdapter(Context myContext, List<CodeName> listVersions) {
        this.myContext = myContext;
        this.codename = listVersions;
    }

    @Override
    public int getCount() {
        return codename.size();
    }

    @Override
    public Object getItem(int position) {
        return codename.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = View.inflate(myContext, R.layout.item_list, null);
        tv_CodeName = view.findViewById(R.id.tvCodename);
        iv_Logo = view.findViewById(R.id.ivLogo);
        tv_CodeName.setText(codename.get(position).getCodename());
        iv_Logo.setImageResource(codename.get(position).getLogo());
        return view;
    }
}

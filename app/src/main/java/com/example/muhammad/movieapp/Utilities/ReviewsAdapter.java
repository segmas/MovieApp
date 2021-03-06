package com.example.muhammad.movieapp.Utilities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.muhammad.movieapp.Model.Reviews;
import com.example.muhammad.movieapp.R;

import java.util.ArrayList;

/**
 * Created by user12 on 12/10/2016.
 */

public class ReviewsAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Reviews> reviewsList;
    public ReviewsAdapter (Context context, ArrayList<Reviews> reviewsList)
    {this.context = context;
        this.reviewsList = reviewsList;
    }
    @Override
    public int getCount() {
        return reviewsList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.list_reviews ,parent,false);
        TextView author = (TextView)convertView.findViewById(R.id.author_name);
        author.setText(reviewsList.get(position).getAuthor());
        TextView content = (TextView)convertView.findViewById(R.id.content_review);
        content.setText(reviewsList.get(position).getContent());
        return convertView;
    }
}

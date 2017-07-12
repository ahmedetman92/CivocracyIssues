package com.example.ahmedetman.civocracydiscussions.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ahmedetman.civocracydiscussions.R;
import com.example.ahmedetman.civocracydiscussions.model.Issue;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Ahmed Etman on 7/12/2017.
 */

public class IssueListAdapter  extends
        RecyclerView.Adapter<IssueListAdapter.CustomViewHolder>
{


    Context mContext;
    ArrayList<Issue> mIssueArrayList;
    public IssueListAdapter(ArrayList<Issue> issues, Context context)
    {
        this.mContext = context;
        this.mIssueArrayList = issues;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);

        return new CustomViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position)
    {
        holder.tagTextView.setText(mIssueArrayList.get(position).getTag());
        holder.summaryTextView.setText(mIssueArrayList.get(position).getSummary());
        Picasso.with(mContext)
                .load(mIssueArrayList.get(position).getImage())
                .into(holder.coverImage);
    }

    @Override
    public int getItemCount()
    {
        return mIssueArrayList.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder
    {
        TextView summaryTextView, tagTextView;
        ImageView coverImage;

        public CustomViewHolder(View view)
        {
            super(view);
            this.summaryTextView = (TextView) view.findViewById(R.id.article_summary_txv);
            this.tagTextView = (TextView) view.findViewById(R.id.article_tag_txv);
            this.coverImage = (ImageView) view.findViewById(R.id.article_cover_img);

        }
    }
}

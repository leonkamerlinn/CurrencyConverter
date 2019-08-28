package com.tenseconds.currencyconverter.helper;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

import co.infinum.mjolnirrecyclerview.MjolnirViewHolder;

public class ItemTouchCallbackHelper extends ItemTouchHelper.Callback {
    private final Context context;

    private int dragFlags;
    private int swipeFlags;
    private boolean enableLongPressDrag;
    private boolean enableItemViewSwipe;


    public ItemTouchCallbackHelper(Context context) {
        this.context = context;
        Activity activity = (Activity) context;



        setDragFlags(ItemTouchHelper.UP | ItemTouchHelper.DOWN);
        setSwipeFlags(ItemTouchHelper.START | ItemTouchHelper.END);
        enableItemViewSwipe(true);
        enableLongPressDrag(true);
    }




    @Override
    public int getMovementFlags(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {


        return ItemTouchHelper.Callback.makeMovementFlags(dragFlags, swipeFlags);
    }



    @Override
    public void onChildDraw(@NonNull Canvas c, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
        if (actionState == ItemTouchHelper.ACTION_STATE_SWIPE) {

            MjolnirViewHolder mjolnirViewHolder = (MjolnirViewHolder)viewHolder;





            super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive);
        } else if (actionState == ItemTouchHelper.ACTION_STATE_DRAG) {
            super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive);
        }

    }



    @Override
    public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        int position = viewHolder.getAdapterPosition();
    }

    @Override
    public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder1) {
        if (viewHolder.getItemViewType() != viewHolder1.getItemViewType()) {
            return false;
        }


        int from = viewHolder.getAdapterPosition();
        int to = viewHolder1.getAdapterPosition();

        return true;
    }

    @Override
    public boolean isLongPressDragEnabled() {
        return enableLongPressDrag;
    }



    @Override
    public boolean isItemViewSwipeEnabled() {
        return enableItemViewSwipe;
    }



    public void setDragFlags(int flag) {
        this.dragFlags = flag;
    }

    public void setSwipeFlags(int flag) {
        this.swipeFlags = flag;
    }

    public void enableLongPressDrag(boolean enable) {
        this.enableLongPressDrag = enable;
    }

    public void enableItemViewSwipe(boolean enable) {
        enableItemViewSwipe = enable;
    }






}

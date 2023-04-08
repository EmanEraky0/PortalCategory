package com.example.portalcategory.databinding;
import com.example.portalcategory.R;
import com.example.portalcategory.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCategoryDetailsBindingImpl extends FragmentCategoryDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.lay_slider, 2);
        sViewsWithIds.put(R.id.time, 3);
        sViewsWithIds.put(R.id.dot_slider, 4);
        sViewsWithIds.put(R.id.img_play, 5);
        sViewsWithIds.put(R.id.v_menu, 6);
        sViewsWithIds.put(R.id.img_arrow, 7);
        sViewsWithIds.put(R.id.img_menu, 8);
        sViewsWithIds.put(R.id.img_fav, 9);
        sViewsWithIds.put(R.id.img_flag, 10);
        sViewsWithIds.put(R.id.img_share, 11);
        sViewsWithIds.put(R.id.lay_timer, 12);
        sViewsWithIds.put(R.id.lay_start, 13);
        sViewsWithIds.put(R.id.txt_start, 14);
        sViewsWithIds.put(R.id.txt_time_start, 15);
        sViewsWithIds.put(R.id.txt_time2, 16);
        sViewsWithIds.put(R.id.lay_date, 17);
        sViewsWithIds.put(R.id.txt_date, 18);
        sViewsWithIds.put(R.id.txt_date1, 19);
        sViewsWithIds.put(R.id.txt_dateTime, 20);
        sViewsWithIds.put(R.id.lay_info, 21);
        sViewsWithIds.put(R.id.txt_name, 22);
        sViewsWithIds.put(R.id.txt_details, 23);
        sViewsWithIds.put(R.id.txt_code, 24);
        sViewsWithIds.put(R.id.ratingBar, 25);
        sViewsWithIds.put(R.id.txt_rate, 26);
        sViewsWithIds.put(R.id.txt_value, 27);
        sViewsWithIds.put(R.id.num_value, 28);
        sViewsWithIds.put(R.id.txt_tax, 29);
        sViewsWithIds.put(R.id.num_tax, 30);
        sViewsWithIds.put(R.id.line1, 31);
        sViewsWithIds.put(R.id.line2, 32);
        sViewsWithIds.put(R.id.txt_price, 33);
        sViewsWithIds.put(R.id.num_price, 34);
        sViewsWithIds.put(R.id.btn_buy, 35);
        sViewsWithIds.put(R.id.btn_skip, 36);
        sViewsWithIds.put(R.id.img_logo, 37);
        sViewsWithIds.put(R.id.txt_allUser, 38);
        sViewsWithIds.put(R.id.txt_all, 39);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCategoryDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 40, sIncludes, sViewsWithIds));
    }
    private FragmentCategoryDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatTextView) bindings[35]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[36]
            , (me.relex.circleindicator.CircleIndicator) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[7]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[9]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[10]
            , (android.widget.ImageView) bindings[37]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[11]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[17]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[21]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[31]
            , (android.widget.ImageView) bindings[32]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[34]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[30]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[28]
            , (android.widget.RatingBar) bindings[25]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[39]
            , (android.widget.TextView) bindings[38]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[24]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[18]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[19]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[20]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[23]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[22]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[33]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[26]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[14]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[29]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[16]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[15]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[27]
            , (android.view.View) bindings[6]
            );
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.rvUser.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.adapter == variableId) {
            setAdapter((com.example.portalcategory.presentation.ui.details.DetailsAdapter) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAdapter(@Nullable com.example.portalcategory.presentation.ui.details.DetailsAdapter Adapter) {
        this.mAdapter = Adapter;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.adapter);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.portalcategory.presentation.ui.details.DetailsAdapter adapter = mAdapter;

        if ((dirtyFlags & 0x3L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.rvUser.setAdapter(adapter);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): adapter
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}
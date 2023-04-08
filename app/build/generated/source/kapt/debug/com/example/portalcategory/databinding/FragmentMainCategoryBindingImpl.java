package com.example.portalcategory.databinding;
import com.example.portalcategory.R;
import com.example.portalcategory.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMainCategoryBindingImpl extends FragmentMainCategoryBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(23);
        sIncludes.setIncludes(1, 
            new String[] {"view_auto_text", "view_input_text", "view_auto_text", "view_input_text", "view_auto_text", "view_input_text", "view_auto_text", "view_input_text", "view_auto_text", "view_input_text", "view_auto_text", "view_input_text", "view_auto_text", "view_input_text", "view_auto_text", "view_input_text"},
            new int[] {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17},
            new int[] {com.example.portalcategory.R.layout.view_auto_text,
                com.example.portalcategory.R.layout.view_input_text,
                com.example.portalcategory.R.layout.view_auto_text,
                com.example.portalcategory.R.layout.view_input_text,
                com.example.portalcategory.R.layout.view_auto_text,
                com.example.portalcategory.R.layout.view_input_text,
                com.example.portalcategory.R.layout.view_auto_text,
                com.example.portalcategory.R.layout.view_input_text,
                com.example.portalcategory.R.layout.view_auto_text,
                com.example.portalcategory.R.layout.view_input_text,
                com.example.portalcategory.R.layout.view_auto_text,
                com.example.portalcategory.R.layout.view_input_text,
                com.example.portalcategory.R.layout.view_auto_text,
                com.example.portalcategory.R.layout.view_input_text,
                com.example.portalcategory.R.layout.view_auto_text,
                com.example.portalcategory.R.layout.view_input_text});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.guidelineStart, 18);
        sViewsWithIds.put(R.id.guidelineEnd, 19);
        sViewsWithIds.put(R.id.txt_title, 20);
        sViewsWithIds.put(R.id.loading, 21);
        sViewsWithIds.put(R.id.btn_send, 22);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMainCategoryBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private FragmentMainCategoryBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 16
            , (com.example.portalcategory.databinding.ViewAutoTextBinding) bindings[8]
            , (android.widget.Button) bindings[22]
            , (com.example.portalcategory.databinding.ViewAutoTextBinding) bindings[16]
            , (androidx.constraintlayout.widget.Guideline) bindings[19]
            , (androidx.constraintlayout.widget.Guideline) bindings[18]
            , (android.widget.ProgressBar) bindings[21]
            , (com.example.portalcategory.databinding.ViewAutoTextBinding) bindings[2]
            , (com.example.portalcategory.databinding.ViewAutoTextBinding) bindings[10]
            , (com.example.portalcategory.databinding.ViewAutoTextBinding) bindings[6]
            , (com.example.portalcategory.databinding.ViewInputTextBinding) bindings[9]
            , (com.example.portalcategory.databinding.ViewInputTextBinding) bindings[17]
            , (com.example.portalcategory.databinding.ViewInputTextBinding) bindings[3]
            , (com.example.portalcategory.databinding.ViewInputTextBinding) bindings[11]
            , (com.example.portalcategory.databinding.ViewInputTextBinding) bindings[7]
            , (com.example.portalcategory.databinding.ViewInputTextBinding) bindings[5]
            , (com.example.portalcategory.databinding.ViewInputTextBinding) bindings[15]
            , (com.example.portalcategory.databinding.ViewInputTextBinding) bindings[13]
            , (com.example.portalcategory.databinding.ViewAutoTextBinding) bindings[4]
            , (com.example.portalcategory.databinding.ViewAutoTextBinding) bindings[14]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[20]
            , (com.example.portalcategory.databinding.ViewAutoTextBinding) bindings[12]
            );
        setContainedBinding(this.brand);
        setContainedBinding(this.fuelType);
        setContainedBinding(this.mainCategories);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        setContainedBinding(this.model);
        setContainedBinding(this.processType);
        setContainedBinding(this.specifyBrand);
        setContainedBinding(this.specifyFuelType);
        setContainedBinding(this.specifyMainCat);
        setContainedBinding(this.specifyModel);
        setContainedBinding(this.specifyProcess);
        setContainedBinding(this.specifySubCat);
        setContainedBinding(this.specifyTransmissionType);
        setContainedBinding(this.specifyType);
        setContainedBinding(this.subCategories);
        setContainedBinding(this.transmissionType);
        setContainedBinding(this.type);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10000L;
        }
        mainCategories.invalidateAll();
        specifyMainCat.invalidateAll();
        subCategories.invalidateAll();
        specifySubCat.invalidateAll();
        processType.invalidateAll();
        specifyProcess.invalidateAll();
        brand.invalidateAll();
        specifyBrand.invalidateAll();
        model.invalidateAll();
        specifyModel.invalidateAll();
        type.invalidateAll();
        specifyType.invalidateAll();
        transmissionType.invalidateAll();
        specifyTransmissionType.invalidateAll();
        fuelType.invalidateAll();
        specifyFuelType.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mainCategories.hasPendingBindings()) {
            return true;
        }
        if (specifyMainCat.hasPendingBindings()) {
            return true;
        }
        if (subCategories.hasPendingBindings()) {
            return true;
        }
        if (specifySubCat.hasPendingBindings()) {
            return true;
        }
        if (processType.hasPendingBindings()) {
            return true;
        }
        if (specifyProcess.hasPendingBindings()) {
            return true;
        }
        if (brand.hasPendingBindings()) {
            return true;
        }
        if (specifyBrand.hasPendingBindings()) {
            return true;
        }
        if (model.hasPendingBindings()) {
            return true;
        }
        if (specifyModel.hasPendingBindings()) {
            return true;
        }
        if (type.hasPendingBindings()) {
            return true;
        }
        if (specifyType.hasPendingBindings()) {
            return true;
        }
        if (transmissionType.hasPendingBindings()) {
            return true;
        }
        if (specifyTransmissionType.hasPendingBindings()) {
            return true;
        }
        if (fuelType.hasPendingBindings()) {
            return true;
        }
        if (specifyFuelType.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mainCategories.setLifecycleOwner(lifecycleOwner);
        specifyMainCat.setLifecycleOwner(lifecycleOwner);
        subCategories.setLifecycleOwner(lifecycleOwner);
        specifySubCat.setLifecycleOwner(lifecycleOwner);
        processType.setLifecycleOwner(lifecycleOwner);
        specifyProcess.setLifecycleOwner(lifecycleOwner);
        brand.setLifecycleOwner(lifecycleOwner);
        specifyBrand.setLifecycleOwner(lifecycleOwner);
        model.setLifecycleOwner(lifecycleOwner);
        specifyModel.setLifecycleOwner(lifecycleOwner);
        type.setLifecycleOwner(lifecycleOwner);
        specifyType.setLifecycleOwner(lifecycleOwner);
        transmissionType.setLifecycleOwner(lifecycleOwner);
        specifyTransmissionType.setLifecycleOwner(lifecycleOwner);
        fuelType.setLifecycleOwner(lifecycleOwner);
        specifyFuelType.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeModel((com.example.portalcategory.databinding.ViewAutoTextBinding) object, fieldId);
            case 1 :
                return onChangeBrand((com.example.portalcategory.databinding.ViewAutoTextBinding) object, fieldId);
            case 2 :
                return onChangeProcessType((com.example.portalcategory.databinding.ViewAutoTextBinding) object, fieldId);
            case 3 :
                return onChangeMainCategories((com.example.portalcategory.databinding.ViewAutoTextBinding) object, fieldId);
            case 4 :
                return onChangeSpecifyTransmissionType((com.example.portalcategory.databinding.ViewInputTextBinding) object, fieldId);
            case 5 :
                return onChangeSpecifyFuelType((com.example.portalcategory.databinding.ViewInputTextBinding) object, fieldId);
            case 6 :
                return onChangeSpecifyMainCat((com.example.portalcategory.databinding.ViewInputTextBinding) object, fieldId);
            case 7 :
                return onChangeSpecifyModel((com.example.portalcategory.databinding.ViewInputTextBinding) object, fieldId);
            case 8 :
                return onChangeSpecifyBrand((com.example.portalcategory.databinding.ViewInputTextBinding) object, fieldId);
            case 9 :
                return onChangeSubCategories((com.example.portalcategory.databinding.ViewAutoTextBinding) object, fieldId);
            case 10 :
                return onChangeFuelType((com.example.portalcategory.databinding.ViewAutoTextBinding) object, fieldId);
            case 11 :
                return onChangeSpecifySubCat((com.example.portalcategory.databinding.ViewInputTextBinding) object, fieldId);
            case 12 :
                return onChangeType((com.example.portalcategory.databinding.ViewAutoTextBinding) object, fieldId);
            case 13 :
                return onChangeSpecifyProcess((com.example.portalcategory.databinding.ViewInputTextBinding) object, fieldId);
            case 14 :
                return onChangeSpecifyType((com.example.portalcategory.databinding.ViewInputTextBinding) object, fieldId);
            case 15 :
                return onChangeTransmissionType((com.example.portalcategory.databinding.ViewAutoTextBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeModel(com.example.portalcategory.databinding.ViewAutoTextBinding Model, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeBrand(com.example.portalcategory.databinding.ViewAutoTextBinding Brand, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeProcessType(com.example.portalcategory.databinding.ViewAutoTextBinding ProcessType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMainCategories(com.example.portalcategory.databinding.ViewAutoTextBinding MainCategories, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSpecifyTransmissionType(com.example.portalcategory.databinding.ViewInputTextBinding SpecifyTransmissionType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSpecifyFuelType(com.example.portalcategory.databinding.ViewInputTextBinding SpecifyFuelType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSpecifyMainCat(com.example.portalcategory.databinding.ViewInputTextBinding SpecifyMainCat, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSpecifyModel(com.example.portalcategory.databinding.ViewInputTextBinding SpecifyModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSpecifyBrand(com.example.portalcategory.databinding.ViewInputTextBinding SpecifyBrand, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSubCategories(com.example.portalcategory.databinding.ViewAutoTextBinding SubCategories, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeFuelType(com.example.portalcategory.databinding.ViewAutoTextBinding FuelType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSpecifySubCat(com.example.portalcategory.databinding.ViewInputTextBinding SpecifySubCat, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeType(com.example.portalcategory.databinding.ViewAutoTextBinding Type, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSpecifyProcess(com.example.portalcategory.databinding.ViewInputTextBinding SpecifyProcess, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSpecifyType(com.example.portalcategory.databinding.ViewInputTextBinding SpecifyType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeTransmissionType(com.example.portalcategory.databinding.ViewAutoTextBinding TransmissionType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8000L;
            }
            return true;
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
        // batch finished
        executeBindingsOn(mainCategories);
        executeBindingsOn(specifyMainCat);
        executeBindingsOn(subCategories);
        executeBindingsOn(specifySubCat);
        executeBindingsOn(processType);
        executeBindingsOn(specifyProcess);
        executeBindingsOn(brand);
        executeBindingsOn(specifyBrand);
        executeBindingsOn(model);
        executeBindingsOn(specifyModel);
        executeBindingsOn(type);
        executeBindingsOn(specifyType);
        executeBindingsOn(transmissionType);
        executeBindingsOn(specifyTransmissionType);
        executeBindingsOn(fuelType);
        executeBindingsOn(specifyFuelType);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): brand
        flag 2 (0x3L): processType
        flag 3 (0x4L): mainCategories
        flag 4 (0x5L): specifyTransmissionType
        flag 5 (0x6L): specifyFuelType
        flag 6 (0x7L): specifyMainCat
        flag 7 (0x8L): specifyModel
        flag 8 (0x9L): specifyBrand
        flag 9 (0xaL): subCategories
        flag 10 (0xbL): fuelType
        flag 11 (0xcL): specifySubCat
        flag 12 (0xdL): type
        flag 13 (0xeL): specifyProcess
        flag 14 (0xfL): specifyType
        flag 15 (0x10L): transmissionType
        flag 16 (0x11L): null
    flag mapping end*/
    //end
}
package com.example.portalcategory;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.portalcategory.databinding.ActivityMainBindingImpl;
import com.example.portalcategory.databinding.FragmentCategoryDetailsBindingImpl;
import com.example.portalcategory.databinding.FragmentMainCategoryBindingImpl;
import com.example.portalcategory.databinding.FragmentSearchCategoryBindingImpl;
import com.example.portalcategory.databinding.RowDetailsBindingImpl;
import com.example.portalcategory.databinding.RowSearchBindingImpl;
import com.example.portalcategory.databinding.ViewAutoTextBindingImpl;
import com.example.portalcategory.databinding.ViewInputTextBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTCATEGORYDETAILS = 2;

  private static final int LAYOUT_FRAGMENTMAINCATEGORY = 3;

  private static final int LAYOUT_FRAGMENTSEARCHCATEGORY = 4;

  private static final int LAYOUT_ROWDETAILS = 5;

  private static final int LAYOUT_ROWSEARCH = 6;

  private static final int LAYOUT_VIEWAUTOTEXT = 7;

  private static final int LAYOUT_VIEWINPUTTEXT = 8;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(8);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.portalcategory.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.portalcategory.R.layout.fragment_category_details, LAYOUT_FRAGMENTCATEGORYDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.portalcategory.R.layout.fragment_main_category, LAYOUT_FRAGMENTMAINCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.portalcategory.R.layout.fragment_search_category, LAYOUT_FRAGMENTSEARCHCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.portalcategory.R.layout.row_details, LAYOUT_ROWDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.portalcategory.R.layout.row_search, LAYOUT_ROWSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.portalcategory.R.layout.view_auto_text, LAYOUT_VIEWAUTOTEXT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.portalcategory.R.layout.view_input_text, LAYOUT_VIEWINPUTTEXT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCATEGORYDETAILS: {
          if ("layout/fragment_category_details_0".equals(tag)) {
            return new FragmentCategoryDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_category_details is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMAINCATEGORY: {
          if ("layout/fragment_main_category_0".equals(tag)) {
            return new FragmentMainCategoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_main_category is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSEARCHCATEGORY: {
          if ("layout/fragment_search_category_0".equals(tag)) {
            return new FragmentSearchCategoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_search_category is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWDETAILS: {
          if ("layout/row_details_0".equals(tag)) {
            return new RowDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_details is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWSEARCH: {
          if ("layout/row_search_0".equals(tag)) {
            return new RowSearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_search is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWAUTOTEXT: {
          if ("layout/view_auto_text_0".equals(tag)) {
            return new ViewAutoTextBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for view_auto_text is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWINPUTTEXT: {
          if ("layout/view_input_text_0".equals(tag)) {
            return new ViewInputTextBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for view_input_text is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "adapter");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(8);

    static {
      sKeys.put("layout/activity_main_0", com.example.portalcategory.R.layout.activity_main);
      sKeys.put("layout/fragment_category_details_0", com.example.portalcategory.R.layout.fragment_category_details);
      sKeys.put("layout/fragment_main_category_0", com.example.portalcategory.R.layout.fragment_main_category);
      sKeys.put("layout/fragment_search_category_0", com.example.portalcategory.R.layout.fragment_search_category);
      sKeys.put("layout/row_details_0", com.example.portalcategory.R.layout.row_details);
      sKeys.put("layout/row_search_0", com.example.portalcategory.R.layout.row_search);
      sKeys.put("layout/view_auto_text_0", com.example.portalcategory.R.layout.view_auto_text);
      sKeys.put("layout/view_input_text_0", com.example.portalcategory.R.layout.view_input_text);
    }
  }
}

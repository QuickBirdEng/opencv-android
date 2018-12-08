//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import org.opencv.core.Rect;

// C++: class DisparityFilter
//javadoc: DisparityFilter

public class DisparityFilter extends Algorithm {

    protected DisparityFilter(long addr) { super(addr); }

    // internal usage only
    public static DisparityFilter __fromPtr__(long addr) { return new DisparityFilter(addr); }

    //
    // C++:  void cv::ximgproc::DisparityFilter::filter(Mat disparity_map_left, Mat left_view, Mat& filtered_disparity_map, Mat disparity_map_right = Mat(), Rect ROI = Rect(), Mat right_view = Mat())
    //

    //javadoc: DisparityFilter::filter(disparity_map_left, left_view, filtered_disparity_map, disparity_map_right, ROI, right_view)
    public  void filter(Mat disparity_map_left, Mat left_view, Mat filtered_disparity_map, Mat disparity_map_right, Rect ROI, Mat right_view)
    {
        
        filter_0(nativeObj, disparity_map_left.nativeObj, left_view.nativeObj, filtered_disparity_map.nativeObj, disparity_map_right.nativeObj, ROI.x, ROI.y, ROI.width, ROI.height, right_view.nativeObj);
        
        return;
    }

    //javadoc: DisparityFilter::filter(disparity_map_left, left_view, filtered_disparity_map, disparity_map_right, ROI)
    public  void filter(Mat disparity_map_left, Mat left_view, Mat filtered_disparity_map, Mat disparity_map_right, Rect ROI)
    {
        
        filter_1(nativeObj, disparity_map_left.nativeObj, left_view.nativeObj, filtered_disparity_map.nativeObj, disparity_map_right.nativeObj, ROI.x, ROI.y, ROI.width, ROI.height);
        
        return;
    }

    //javadoc: DisparityFilter::filter(disparity_map_left, left_view, filtered_disparity_map, disparity_map_right)
    public  void filter(Mat disparity_map_left, Mat left_view, Mat filtered_disparity_map, Mat disparity_map_right)
    {
        
        filter_2(nativeObj, disparity_map_left.nativeObj, left_view.nativeObj, filtered_disparity_map.nativeObj, disparity_map_right.nativeObj);
        
        return;
    }

    //javadoc: DisparityFilter::filter(disparity_map_left, left_view, filtered_disparity_map)
    public  void filter(Mat disparity_map_left, Mat left_view, Mat filtered_disparity_map)
    {
        
        filter_3(nativeObj, disparity_map_left.nativeObj, left_view.nativeObj, filtered_disparity_map.nativeObj);
        
        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  void cv::ximgproc::DisparityFilter::filter(Mat disparity_map_left, Mat left_view, Mat& filtered_disparity_map, Mat disparity_map_right = Mat(), Rect ROI = Rect(), Mat right_view = Mat())
    private static native void filter_0(long nativeObj, long disparity_map_left_nativeObj, long left_view_nativeObj, long filtered_disparity_map_nativeObj, long disparity_map_right_nativeObj, int ROI_x, int ROI_y, int ROI_width, int ROI_height, long right_view_nativeObj);
    private static native void filter_1(long nativeObj, long disparity_map_left_nativeObj, long left_view_nativeObj, long filtered_disparity_map_nativeObj, long disparity_map_right_nativeObj, int ROI_x, int ROI_y, int ROI_width, int ROI_height);
    private static native void filter_2(long nativeObj, long disparity_map_left_nativeObj, long left_view_nativeObj, long filtered_disparity_map_nativeObj, long disparity_map_right_nativeObj);
    private static native void filter_3(long nativeObj, long disparity_map_left_nativeObj, long left_view_nativeObj, long filtered_disparity_map_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}

//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import org.opencv.core.Rect;

// C++: class DisparityFilter
/**
 * Main interface for all disparity map filters.
 */
public class DisparityFilter extends Algorithm {

    protected DisparityFilter(long addr) { super(addr); }

    // internal usage only
    public static DisparityFilter __fromPtr__(long addr) { return new DisparityFilter(addr); }

    //
    // C++:  void cv::ximgproc::DisparityFilter::filter(Mat disparity_map_left, Mat left_view, Mat& filtered_disparity_map, Mat disparity_map_right = Mat(), Rect ROI = Rect(), Mat right_view = Mat())
    //

    /**
     * Apply filtering to the disparity map.
     *
     *     @param disparity_map_left disparity map of the left view, 1 channel, CV_16S type. Implicitly assumes that disparity
     *     values are scaled by 16 (one-pixel disparity corresponds to the value of 16 in the disparity map). Disparity map
     *     can have any resolution, it will be automatically resized to fit left_view resolution.
     *
     *     @param left_view left view of the original stereo-pair to guide the filtering process, 8-bit single-channel
     *     or three-channel image.
     *
     *     @param filtered_disparity_map output disparity map.
     *
     *     @param disparity_map_right optional argument, some implementations might also use the disparity map
     *     of the right view to compute confidence maps, for instance.
     *
     *     @param ROI region of the disparity map to filter. Optional, usually it should be set automatically.
     *
     *     @param right_view optional argument, some implementations might also use the right view of the original
     *     stereo-pair.
     */
    public void filter(Mat disparity_map_left, Mat left_view, Mat filtered_disparity_map, Mat disparity_map_right, Rect ROI, Mat right_view) {
        filter_0(nativeObj, disparity_map_left.nativeObj, left_view.nativeObj, filtered_disparity_map.nativeObj, disparity_map_right.nativeObj, ROI.x, ROI.y, ROI.width, ROI.height, right_view.nativeObj);
    }

    /**
     * Apply filtering to the disparity map.
     *
     *     @param disparity_map_left disparity map of the left view, 1 channel, CV_16S type. Implicitly assumes that disparity
     *     values are scaled by 16 (one-pixel disparity corresponds to the value of 16 in the disparity map). Disparity map
     *     can have any resolution, it will be automatically resized to fit left_view resolution.
     *
     *     @param left_view left view of the original stereo-pair to guide the filtering process, 8-bit single-channel
     *     or three-channel image.
     *
     *     @param filtered_disparity_map output disparity map.
     *
     *     @param disparity_map_right optional argument, some implementations might also use the disparity map
     *     of the right view to compute confidence maps, for instance.
     *
     *     @param ROI region of the disparity map to filter. Optional, usually it should be set automatically.
     *
     *     stereo-pair.
     */
    public void filter(Mat disparity_map_left, Mat left_view, Mat filtered_disparity_map, Mat disparity_map_right, Rect ROI) {
        filter_1(nativeObj, disparity_map_left.nativeObj, left_view.nativeObj, filtered_disparity_map.nativeObj, disparity_map_right.nativeObj, ROI.x, ROI.y, ROI.width, ROI.height);
    }

    /**
     * Apply filtering to the disparity map.
     *
     *     @param disparity_map_left disparity map of the left view, 1 channel, CV_16S type. Implicitly assumes that disparity
     *     values are scaled by 16 (one-pixel disparity corresponds to the value of 16 in the disparity map). Disparity map
     *     can have any resolution, it will be automatically resized to fit left_view resolution.
     *
     *     @param left_view left view of the original stereo-pair to guide the filtering process, 8-bit single-channel
     *     or three-channel image.
     *
     *     @param filtered_disparity_map output disparity map.
     *
     *     @param disparity_map_right optional argument, some implementations might also use the disparity map
     *     of the right view to compute confidence maps, for instance.
     *
     *
     *     stereo-pair.
     */
    public void filter(Mat disparity_map_left, Mat left_view, Mat filtered_disparity_map, Mat disparity_map_right) {
        filter_2(nativeObj, disparity_map_left.nativeObj, left_view.nativeObj, filtered_disparity_map.nativeObj, disparity_map_right.nativeObj);
    }

    /**
     * Apply filtering to the disparity map.
     *
     *     @param disparity_map_left disparity map of the left view, 1 channel, CV_16S type. Implicitly assumes that disparity
     *     values are scaled by 16 (one-pixel disparity corresponds to the value of 16 in the disparity map). Disparity map
     *     can have any resolution, it will be automatically resized to fit left_view resolution.
     *
     *     @param left_view left view of the original stereo-pair to guide the filtering process, 8-bit single-channel
     *     or three-channel image.
     *
     *     @param filtered_disparity_map output disparity map.
     *
     *     of the right view to compute confidence maps, for instance.
     *
     *
     *     stereo-pair.
     */
    public void filter(Mat disparity_map_left, Mat left_view, Mat filtered_disparity_map) {
        filter_3(nativeObj, disparity_map_left.nativeObj, left_view.nativeObj, filtered_disparity_map.nativeObj);
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

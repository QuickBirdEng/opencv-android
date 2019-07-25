//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;

// C++: class StructuredEdgeDetection
//javadoc: StructuredEdgeDetection

public class StructuredEdgeDetection extends Algorithm {

    protected StructuredEdgeDetection(long addr) { super(addr); }

    // internal usage only
    public static StructuredEdgeDetection __fromPtr__(long addr) { return new StructuredEdgeDetection(addr); }

    //
    // C++:  void cv::ximgproc::StructuredEdgeDetection::computeOrientation(Mat _src, Mat& _dst)
    //

    //javadoc: StructuredEdgeDetection::computeOrientation(_src, _dst)
    public  void computeOrientation(Mat _src, Mat _dst)
    {
        
        computeOrientation_0(nativeObj, _src.nativeObj, _dst.nativeObj);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::StructuredEdgeDetection::detectEdges(Mat _src, Mat& _dst)
    //

    //javadoc: StructuredEdgeDetection::detectEdges(_src, _dst)
    public  void detectEdges(Mat _src, Mat _dst)
    {
        
        detectEdges_0(nativeObj, _src.nativeObj, _dst.nativeObj);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::StructuredEdgeDetection::edgesNms(Mat edge_image, Mat orientation_image, Mat& _dst, int r = 2, int s = 0, float m = 1, bool isParallel = true)
    //

    //javadoc: StructuredEdgeDetection::edgesNms(edge_image, orientation_image, _dst, r, s, m, isParallel)
    public  void edgesNms(Mat edge_image, Mat orientation_image, Mat _dst, int r, int s, float m, boolean isParallel)
    {
        
        edgesNms_0(nativeObj, edge_image.nativeObj, orientation_image.nativeObj, _dst.nativeObj, r, s, m, isParallel);
        
        return;
    }

    //javadoc: StructuredEdgeDetection::edgesNms(edge_image, orientation_image, _dst, r, s, m)
    public  void edgesNms(Mat edge_image, Mat orientation_image, Mat _dst, int r, int s, float m)
    {
        
        edgesNms_1(nativeObj, edge_image.nativeObj, orientation_image.nativeObj, _dst.nativeObj, r, s, m);
        
        return;
    }

    //javadoc: StructuredEdgeDetection::edgesNms(edge_image, orientation_image, _dst, r, s)
    public  void edgesNms(Mat edge_image, Mat orientation_image, Mat _dst, int r, int s)
    {
        
        edgesNms_2(nativeObj, edge_image.nativeObj, orientation_image.nativeObj, _dst.nativeObj, r, s);
        
        return;
    }

    //javadoc: StructuredEdgeDetection::edgesNms(edge_image, orientation_image, _dst, r)
    public  void edgesNms(Mat edge_image, Mat orientation_image, Mat _dst, int r)
    {
        
        edgesNms_3(nativeObj, edge_image.nativeObj, orientation_image.nativeObj, _dst.nativeObj, r);
        
        return;
    }

    //javadoc: StructuredEdgeDetection::edgesNms(edge_image, orientation_image, _dst)
    public  void edgesNms(Mat edge_image, Mat orientation_image, Mat _dst)
    {
        
        edgesNms_4(nativeObj, edge_image.nativeObj, orientation_image.nativeObj, _dst.nativeObj);
        
        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  void cv::ximgproc::StructuredEdgeDetection::computeOrientation(Mat _src, Mat& _dst)
    private static native void computeOrientation_0(long nativeObj, long _src_nativeObj, long _dst_nativeObj);

    // C++:  void cv::ximgproc::StructuredEdgeDetection::detectEdges(Mat _src, Mat& _dst)
    private static native void detectEdges_0(long nativeObj, long _src_nativeObj, long _dst_nativeObj);

    // C++:  void cv::ximgproc::StructuredEdgeDetection::edgesNms(Mat edge_image, Mat orientation_image, Mat& _dst, int r = 2, int s = 0, float m = 1, bool isParallel = true)
    private static native void edgesNms_0(long nativeObj, long edge_image_nativeObj, long orientation_image_nativeObj, long _dst_nativeObj, int r, int s, float m, boolean isParallel);
    private static native void edgesNms_1(long nativeObj, long edge_image_nativeObj, long orientation_image_nativeObj, long _dst_nativeObj, int r, int s, float m);
    private static native void edgesNms_2(long nativeObj, long edge_image_nativeObj, long orientation_image_nativeObj, long _dst_nativeObj, int r, int s);
    private static native void edgesNms_3(long nativeObj, long edge_image_nativeObj, long orientation_image_nativeObj, long _dst_nativeObj, int r);
    private static native void edgesNms_4(long nativeObj, long edge_image_nativeObj, long orientation_image_nativeObj, long _dst_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}

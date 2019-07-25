//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.plot;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;
import org.opencv.plot.Plot2d;

// C++: class Plot2d
//javadoc: Plot2d

public class Plot2d extends Algorithm {

    protected Plot2d(long addr) { super(addr); }

    // internal usage only
    public static Plot2d __fromPtr__(long addr) { return new Plot2d(addr); }

    //
    // C++: static Ptr_Plot2d cv::plot::Plot2d::create(Mat data)
    //

    //javadoc: Plot2d::create(data)
    public static Plot2d create(Mat data)
    {
        
        Plot2d retVal = Plot2d.__fromPtr__(create_0(data.nativeObj));
        
        return retVal;
    }


    //
    // C++: static Ptr_Plot2d cv::plot::Plot2d::create(Mat dataX, Mat dataY)
    //

    //javadoc: Plot2d::create(dataX, dataY)
    public static Plot2d create(Mat dataX, Mat dataY)
    {
        
        Plot2d retVal = Plot2d.__fromPtr__(create_1(dataX.nativeObj, dataY.nativeObj));
        
        return retVal;
    }


    //
    // C++:  void cv::plot::Plot2d::render(Mat& _plotResult)
    //

    //javadoc: Plot2d::render(_plotResult)
    public  void render(Mat _plotResult)
    {
        
        render_0(nativeObj, _plotResult.nativeObj);
        
        return;
    }


    //
    // C++:  void cv::plot::Plot2d::setGridLinesNumber(int gridLinesNumber)
    //

    //javadoc: Plot2d::setGridLinesNumber(gridLinesNumber)
    public  void setGridLinesNumber(int gridLinesNumber)
    {
        
        setGridLinesNumber_0(nativeObj, gridLinesNumber);
        
        return;
    }


    //
    // C++:  void cv::plot::Plot2d::setInvertOrientation(bool _invertOrientation)
    //

    //javadoc: Plot2d::setInvertOrientation(_invertOrientation)
    public  void setInvertOrientation(boolean _invertOrientation)
    {
        
        setInvertOrientation_0(nativeObj, _invertOrientation);
        
        return;
    }


    //
    // C++:  void cv::plot::Plot2d::setMaxX(double _plotMaxX)
    //

    //javadoc: Plot2d::setMaxX(_plotMaxX)
    public  void setMaxX(double _plotMaxX)
    {
        
        setMaxX_0(nativeObj, _plotMaxX);
        
        return;
    }


    //
    // C++:  void cv::plot::Plot2d::setMaxY(double _plotMaxY)
    //

    //javadoc: Plot2d::setMaxY(_plotMaxY)
    public  void setMaxY(double _plotMaxY)
    {
        
        setMaxY_0(nativeObj, _plotMaxY);
        
        return;
    }


    //
    // C++:  void cv::plot::Plot2d::setMinX(double _plotMinX)
    //

    //javadoc: Plot2d::setMinX(_plotMinX)
    public  void setMinX(double _plotMinX)
    {
        
        setMinX_0(nativeObj, _plotMinX);
        
        return;
    }


    //
    // C++:  void cv::plot::Plot2d::setMinY(double _plotMinY)
    //

    //javadoc: Plot2d::setMinY(_plotMinY)
    public  void setMinY(double _plotMinY)
    {
        
        setMinY_0(nativeObj, _plotMinY);
        
        return;
    }


    //
    // C++:  void cv::plot::Plot2d::setNeedPlotLine(bool _needPlotLine)
    //

    //javadoc: Plot2d::setNeedPlotLine(_needPlotLine)
    public  void setNeedPlotLine(boolean _needPlotLine)
    {
        
        setNeedPlotLine_0(nativeObj, _needPlotLine);
        
        return;
    }


    //
    // C++:  void cv::plot::Plot2d::setPlotAxisColor(Scalar _plotAxisColor)
    //

    //javadoc: Plot2d::setPlotAxisColor(_plotAxisColor)
    public  void setPlotAxisColor(Scalar _plotAxisColor)
    {
        
        setPlotAxisColor_0(nativeObj, _plotAxisColor.val[0], _plotAxisColor.val[1], _plotAxisColor.val[2], _plotAxisColor.val[3]);
        
        return;
    }


    //
    // C++:  void cv::plot::Plot2d::setPlotBackgroundColor(Scalar _plotBackgroundColor)
    //

    //javadoc: Plot2d::setPlotBackgroundColor(_plotBackgroundColor)
    public  void setPlotBackgroundColor(Scalar _plotBackgroundColor)
    {
        
        setPlotBackgroundColor_0(nativeObj, _plotBackgroundColor.val[0], _plotBackgroundColor.val[1], _plotBackgroundColor.val[2], _plotBackgroundColor.val[3]);
        
        return;
    }


    //
    // C++:  void cv::plot::Plot2d::setPlotGridColor(Scalar _plotGridColor)
    //

    //javadoc: Plot2d::setPlotGridColor(_plotGridColor)
    public  void setPlotGridColor(Scalar _plotGridColor)
    {
        
        setPlotGridColor_0(nativeObj, _plotGridColor.val[0], _plotGridColor.val[1], _plotGridColor.val[2], _plotGridColor.val[3]);
        
        return;
    }


    //
    // C++:  void cv::plot::Plot2d::setPlotLineColor(Scalar _plotLineColor)
    //

    //javadoc: Plot2d::setPlotLineColor(_plotLineColor)
    public  void setPlotLineColor(Scalar _plotLineColor)
    {
        
        setPlotLineColor_0(nativeObj, _plotLineColor.val[0], _plotLineColor.val[1], _plotLineColor.val[2], _plotLineColor.val[3]);
        
        return;
    }


    //
    // C++:  void cv::plot::Plot2d::setPlotLineWidth(int _plotLineWidth)
    //

    //javadoc: Plot2d::setPlotLineWidth(_plotLineWidth)
    public  void setPlotLineWidth(int _plotLineWidth)
    {
        
        setPlotLineWidth_0(nativeObj, _plotLineWidth);
        
        return;
    }


    //
    // C++:  void cv::plot::Plot2d::setPlotSize(int _plotSizeWidth, int _plotSizeHeight)
    //

    //javadoc: Plot2d::setPlotSize(_plotSizeWidth, _plotSizeHeight)
    public  void setPlotSize(int _plotSizeWidth, int _plotSizeHeight)
    {
        
        setPlotSize_0(nativeObj, _plotSizeWidth, _plotSizeHeight);
        
        return;
    }


    //
    // C++:  void cv::plot::Plot2d::setPlotTextColor(Scalar _plotTextColor)
    //

    //javadoc: Plot2d::setPlotTextColor(_plotTextColor)
    public  void setPlotTextColor(Scalar _plotTextColor)
    {
        
        setPlotTextColor_0(nativeObj, _plotTextColor.val[0], _plotTextColor.val[1], _plotTextColor.val[2], _plotTextColor.val[3]);
        
        return;
    }


    //
    // C++:  void cv::plot::Plot2d::setPointIdxToPrint(int pointIdx)
    //

    //javadoc: Plot2d::setPointIdxToPrint(pointIdx)
    public  void setPointIdxToPrint(int pointIdx)
    {
        
        setPointIdxToPrint_0(nativeObj, pointIdx);
        
        return;
    }


    //
    // C++:  void cv::plot::Plot2d::setShowGrid(bool needShowGrid)
    //

    //javadoc: Plot2d::setShowGrid(needShowGrid)
    public  void setShowGrid(boolean needShowGrid)
    {
        
        setShowGrid_0(nativeObj, needShowGrid);
        
        return;
    }


    //
    // C++:  void cv::plot::Plot2d::setShowText(bool needShowText)
    //

    //javadoc: Plot2d::setShowText(needShowText)
    public  void setShowText(boolean needShowText)
    {
        
        setShowText_0(nativeObj, needShowText);
        
        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_Plot2d cv::plot::Plot2d::create(Mat data)
    private static native long create_0(long data_nativeObj);

    // C++: static Ptr_Plot2d cv::plot::Plot2d::create(Mat dataX, Mat dataY)
    private static native long create_1(long dataX_nativeObj, long dataY_nativeObj);

    // C++:  void cv::plot::Plot2d::render(Mat& _plotResult)
    private static native void render_0(long nativeObj, long _plotResult_nativeObj);

    // C++:  void cv::plot::Plot2d::setGridLinesNumber(int gridLinesNumber)
    private static native void setGridLinesNumber_0(long nativeObj, int gridLinesNumber);

    // C++:  void cv::plot::Plot2d::setInvertOrientation(bool _invertOrientation)
    private static native void setInvertOrientation_0(long nativeObj, boolean _invertOrientation);

    // C++:  void cv::plot::Plot2d::setMaxX(double _plotMaxX)
    private static native void setMaxX_0(long nativeObj, double _plotMaxX);

    // C++:  void cv::plot::Plot2d::setMaxY(double _plotMaxY)
    private static native void setMaxY_0(long nativeObj, double _plotMaxY);

    // C++:  void cv::plot::Plot2d::setMinX(double _plotMinX)
    private static native void setMinX_0(long nativeObj, double _plotMinX);

    // C++:  void cv::plot::Plot2d::setMinY(double _plotMinY)
    private static native void setMinY_0(long nativeObj, double _plotMinY);

    // C++:  void cv::plot::Plot2d::setNeedPlotLine(bool _needPlotLine)
    private static native void setNeedPlotLine_0(long nativeObj, boolean _needPlotLine);

    // C++:  void cv::plot::Plot2d::setPlotAxisColor(Scalar _plotAxisColor)
    private static native void setPlotAxisColor_0(long nativeObj, double _plotAxisColor_val0, double _plotAxisColor_val1, double _plotAxisColor_val2, double _plotAxisColor_val3);

    // C++:  void cv::plot::Plot2d::setPlotBackgroundColor(Scalar _plotBackgroundColor)
    private static native void setPlotBackgroundColor_0(long nativeObj, double _plotBackgroundColor_val0, double _plotBackgroundColor_val1, double _plotBackgroundColor_val2, double _plotBackgroundColor_val3);

    // C++:  void cv::plot::Plot2d::setPlotGridColor(Scalar _plotGridColor)
    private static native void setPlotGridColor_0(long nativeObj, double _plotGridColor_val0, double _plotGridColor_val1, double _plotGridColor_val2, double _plotGridColor_val3);

    // C++:  void cv::plot::Plot2d::setPlotLineColor(Scalar _plotLineColor)
    private static native void setPlotLineColor_0(long nativeObj, double _plotLineColor_val0, double _plotLineColor_val1, double _plotLineColor_val2, double _plotLineColor_val3);

    // C++:  void cv::plot::Plot2d::setPlotLineWidth(int _plotLineWidth)
    private static native void setPlotLineWidth_0(long nativeObj, int _plotLineWidth);

    // C++:  void cv::plot::Plot2d::setPlotSize(int _plotSizeWidth, int _plotSizeHeight)
    private static native void setPlotSize_0(long nativeObj, int _plotSizeWidth, int _plotSizeHeight);

    // C++:  void cv::plot::Plot2d::setPlotTextColor(Scalar _plotTextColor)
    private static native void setPlotTextColor_0(long nativeObj, double _plotTextColor_val0, double _plotTextColor_val1, double _plotTextColor_val2, double _plotTextColor_val3);

    // C++:  void cv::plot::Plot2d::setPointIdxToPrint(int pointIdx)
    private static native void setPointIdxToPrint_0(long nativeObj, int pointIdx);

    // C++:  void cv::plot::Plot2d::setShowGrid(bool needShowGrid)
    private static native void setShowGrid_0(long nativeObj, boolean needShowGrid);

    // C++:  void cv::plot::Plot2d::setShowText(bool needShowText)
    private static native void setShowText_0(long nativeObj, boolean needShowText);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}

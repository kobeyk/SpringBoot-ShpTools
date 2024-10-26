package com.appleyk;

import com.appleyk.geotools.ShpTools;
import org.junit.Test;

/**
 * <p></p>
 *
 * @author appleyk
 * @version v.3.0.0
 * @blob https://blog.csdn.net/appleyk
 * @github https://github.com/kobeyk
 * @date created on 2024/7/5-11:58
 */
public class Shp2ImageTest {
    @Test
    public void shp2Image() throws Exception{
        String shpPath = "U:\\数据存储\\iis_sample_datas\\1345227915142208\\1747900665907968\\1806438205945984\\2024\\10\\25\\2024-10-25-20-41-05\\1004\\1004.shp";
        String destImagePath = "U:\\数据存储\\iis_sample_datas\\1345227915142208\\1747900665907968\\1806438205945984\\2024\\10\\25\\2024-10-25-20-41-05\\1004\\1004.shp.png";
        String color = "black";
        ShpTools.shp2Image(shpPath, destImagePath ,color,600,800);
    }
}

package com.landa.nameplatesystem.controller.namePlate;

import com.landa.nameplatesystem.pojo.Nameplate;
import com.landa.nameplatesystem.service.NamePlateService;
import com.landa.nameplatesystem.utils.Constants;
import com.landa.nameplatesystem.utils.LogExampleOther;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/nameplate")
public class NamePlateController {

    @Autowired
    private Nameplate nameplate;

    @Autowired
    private NamePlateService namePlateService;

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    /**
     * 页面跳转
     *
     * @return
     */
    @RequestMapping("/toNamePlateList")
    public String toNamePlateRecord() {
        return "namePlate/list";
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    /**
     * 查询铭牌记录
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public List<Map> getNamePlateRecord() {
        LogExampleOther.log.info(Constants.SYSTEMNAME + ":进入铭牌记录列表");
        String filter = "";
        List<Map> list = namePlateService.getNamePlateAndUnitCode(filter);
        System.out.println(list.toString());
        return list;
    }

    /**
     * 添加铭牌记录
     *
     * @param nameplate
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addNamePlateRecord(Nameplate nameplate) {
        Date date = new Date();
        String displayDate = sdf.format(date);
        nameplate.setDisplaydate(displayDate);
        if (nameplate.getMinbarcode() != null && !nameplate.getMinbarcode().equals("")) {
            if (nameplate.getMaxbarcode() != null && !nameplate.getMaxbarcode().equals("")) {
                int maxBarcode = Integer.parseInt(nameplate.getMaxbarcode().substring(9));
                int minCode = Integer.parseInt(nameplate.getMinbarcode().substring(9));
                nameplate.setBarcodenum(maxBarcode - minCode);
            }
        }
        namePlateService.addNamePlateRecord(nameplate);
    }

    /**
     * 删除铭牌记录
     */
    public void deleteNamePlateRecord() {
        namePlateService.deleteNamePlateRecord();
    }

    /**
     * 修改铭牌记录
     */
    public void updateNamePlateRecord() {
        namePlateService.updateNamePlateRecord();
    }

}

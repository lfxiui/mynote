package com.lifuxi.mynote.TestService;

import com.lifuxi.mynote.service.NoteService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestServiceTest {
    @Autowired
    private NoteService noteService;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void insert() throws Exception {
        noteService.getAllNotes();
    }
    
    public String downLoadExcel(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<WaterPoint> waterPointList = waterPointService.getWaterPointList();
        if (waterPointList != null && waterPointList.size() > 0) {
            String fileName = "test.xlsx";
            //设置文件头编码格式
            response.setHeader("Content-disposition", "attachment;filename="
                    + new String(fileName.getBytes("gb2312"), "ISO8859-1"));
            //设置类型
            response.setContentType("APPLICATION/OCTET-STREAM;charset=UTF-8");
            //设置头
            response.setHeader("Cache-Control", "no-cache");
            //设置日期头
            response.setDateHeader("Expires", 0);

            XSSFWorkbook workbook = new XSSFWorkbook();

            XSSFSheet sheet = workbook.createSheet();
            CellStyle cellStyle = workbook.createCellStyle();

            cellStyle.setDataFormat(workbook.createDataFormat().getFormat("yyyy-MM-dd HH:mm:ss"));

            int rowNum = 0;
            //将积水点数据逐行填入单元格
            for (WaterPoint waterPoint : waterPointList) {
                Row row = sheet.createRow(rowNum);

                Cell cell = row.createCell(0);
                cell.setCellStyle(cellStyle);
                cell.setCellValue(waterPoint.getIdentifier());

                Cell cell1 = row.createCell(1);
                cell1.setCellValue(waterPoint.getInfluencePeople());

                Cell cell2 = row.createCell(2);
                cell2.setCellValue(waterPoint.getInfluenceSchool());

                Cell cell3 = row.createCell(3);
                cell3.setCellValue(waterPoint.getInfluenceStreet());

                Cell cell4 = row.createCell(4);
                cell4.setCellValue(waterPoint.getName());

                Cell cell5 = row.createCell(5);
                cell5.setCellValue(waterPoint.getLat());

                Cell cell6 = row.createCell(6);
                cell6.setCellValue(waterPoint.getLon());

                rowNum++;
            }

            workbook.write(response.getOutputStream());

            response.getOutputStream().flush();
            response.getOutputStream().close();
        }
        return null;
    }
}

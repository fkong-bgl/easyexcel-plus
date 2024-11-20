package ai.chat2db.excel.test.core.exception;

import ai.chat2db.excel.annotation.ExcelProperty;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Jiaju Zhuang
 */
@Getter
@Setter
@EqualsAndHashCode
public class ExceptionData {
    @ExcelProperty("姓名")
    private String name;
}
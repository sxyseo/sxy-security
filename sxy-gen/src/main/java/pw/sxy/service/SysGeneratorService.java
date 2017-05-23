package pw.sxy.service;

import java.util.List;
import java.util.Map;

/**
 * 代码生成器
 *
 * @author sxy
 * @email admin@sxyseo.com
 * @date 2017-05-23 15:15:15
 */
public interface SysGeneratorService {

    List<Map<String, Object>> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    Map<String, String> queryTable(String tableName);

    List<Map<String, String>> queryColumns(String tableName);

    /**
     * 生成代码
     */
    byte[] generatorCode(String[] tableNames);
}

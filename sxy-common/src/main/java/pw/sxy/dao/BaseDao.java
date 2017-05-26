package pw.sxy.dao;

import java.util.List;
import java.util.Map;

/**
 * 基础Dao(还需在XML文件里，有对应的SQL语句)
 * 
 * @author sxy
 * @email admin@sxyseo.com
 * @date 2017-05-23 15:22:06
 */
public interface BaseDao<T> {

	// 新增
	void save(T t);

	// 新增
	void save(Map<String, Object> map);

	// 新增
	void saveBatch(List<T> list);

	// 更新
	int update(T t);

	// 更新
	int update(Map<String, Object> map);

	// 删除
	int delete(Object id);

	// 删除
	int delete(Map<String, Object> map);

	// 删除
	int deleteBatch(Object[] id);

	// 查询
	T queryObject(Object id);
	
	List<T> queryList(Map<String, Object> map);
	
	List<T> queryList(Object id);
	
	int queryTotal(Map<String, Object> map);

	int queryTotal();
}

package pw.sxy.dao;

import pw.sxy.entity.ScheduleJobEntity;

import java.util.Map;

/**
 * 定时任务
 *
 * @author sxy
 * @email admin@sxyseo.com
 * @date 2017-05-23 15:15:15
 */
public interface ScheduleJobDao extends BaseDao<ScheduleJobEntity> {

    /**
     * 批量更新状态
     */
    int updateBatch(Map<String, Object> map);
}

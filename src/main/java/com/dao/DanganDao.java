package com.dao;

import com.entity.DanganEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.DanganView;

/**
 * 档案信息 Dao 接口
 *
 * @author 
 */
public interface DanganDao extends BaseMapper<DanganEntity> {

   List<DanganView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}

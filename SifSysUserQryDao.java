package cn.sunline.dao.endauth;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
111
import cn.sunline.domain.endauth.SifSysUserQry;
import cn.sunline.domain.endauth.SifSysUserQryPk;
public interface SifSysUserQryDao {

	public Page<SifSysUserQry> findAll(Pageable pageable);

	public <S extends SifSysUserQry> S save(S entity);

	public SifSysUserQry findOne(SifSysUserQryPk id);

	public boolean exists(SifSysUserQryPk id);
1111111
	public long count();

	public void delete(SifSysUserQryPk id);

	public void delete(SifSysUserQry entity);

	public void delete(Iterable<? extends SifSysUserQry> entities);

	public void deleteAll();

	public List<SifSysUserQry> findAll();

	public List<SifSysUserQry> findAll(Sort sort);

	public List<SifSysUserQry> findAll(Iterable<SifSysUserQryPk> ids) ;

	public <S extends SifSysUserQry> List<S> save(Iterable<S> entities);

	public void flush();

	public <S extends SifSysUserQry> S saveAndFlush(S entity);

	public void deleteInBatch(Iterable<SifSysUserQry> entities) ;

	public void deleteAllInBatch();

	public SifSysUserQry getOne(SifSysUserQryPk id);
	
	/**
	 * 鏍规嵁妯＄増鏌ヨ瀹炰綋
	 * @param tmp 妯＄増瀵硅薄
	 * @return 鏌ヨ鍒扮殑瀹炰綋瀵硅薄闆嗗悎
	 */
	List<SifSysUserQry> queryByTemplate(final SifSysUserQry tmp);
	
	/**
	 * 鏍规嵁妯＄増鎺掑簭鏌ヨ瀹炰綋
	 * @param tmp 妯＄増瀵硅薄
	 * @param sort 鎺掑簭妯℃澘
	 * @return 鏌ヨ鍒扮殑瀹炰綋瀵硅薄闆嗗悎
	 */
	List<SifSysUserQry> queryByTemplate(final SifSysUserQry tmp, Sort sort);
	
	/**
	 * 鏍规嵁妯＄増鍒嗛〉鎺掑簭鏌ヨ瀹炰綋
	 * @param tmp 妯＄増瀵硅薄
	 * @param pageable 鍒嗛〉鎺掑簭妯＄増
	 * @return Page瀵硅薄
	 */
	Page<SifSysUserQry> queryByTemplate(final SifSysUserQry tmp,Pageable pageable);
	
	/**
	 * 鏍规嵁娉ㄥ唽鏈烘瀯鍙峰拰鎿嶄綔鍛樺彿鏌ヨ
	 * @param registerCd 娉ㄥ唽鏈烘瀯鍙�
	 * @param userCd	鎿嶄綔鍛樺彿
	 * @return 鏌ヨ鍒扮殑瀹炰綋瀵硅薄闆嗗悎
	 */
	List<SifSysUserQry> queryQryUsers(String registerCd, String userCd);

}

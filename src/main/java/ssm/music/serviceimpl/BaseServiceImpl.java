package ssm.music.serviceimpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ssm.music.service.BaseService;

@Service("Base")
@Transactional
public class BaseServiceImpl<E> implements BaseService<E> {

	public void add(E e) {
	}
	
}

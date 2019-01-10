package com.wthealth.service.socket.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.wthealth.common.Search;
import com.wthealth.domain.Live;
import com.wthealth.service.socket.SocketDao;
import com.wthealth.service.socket.SocketService;

@Service("socketServiceImpl")
public class SocketServiceImpl implements SocketService {
	///Field
	@Autowired
	@Qualifier("socketServiceImpl")
	private SocketDao socketDao;
	public void setSocketDao(SocketDao socketDao) {
		this.socketDao = socketDao;
	}

	///Constructor
	public SocketServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	///Method
	@Override
	public void addLiveStream(Live live) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Live getLiveStream(int liveNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteLiveStream(int liveNo) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Live> listLiveStream(Search search) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addBattleStream(Live live) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Live getBattleStream(int liveNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBattleStream(int liveNo) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void addPlayer(String userId) throws Exception {
		// TODO Auto-generated method stub

	}

}

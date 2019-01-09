package com.wthealth.service.socket;

import java.util.List;

import com.wthealth.common.Search;
import com.wthealth.domain.Live;

public interface SocketService {
	//INSERT LiveStream
	public void addLiveStream(Live live) throws Exception;
		
	//SELECT ONE
	public Live getLiveStream(int liveNo) throws Exception;
		
	//DELETE LiveStream -> (주의) Update 해야 함
	public void deleteLiveStream(int liveNo) throws Exception;	
		
	//SELECT LIST
	public List<Live> listLiveStream(Search search) throws Exception;
		
	//INSERT BattleStream
	public void addBattleStream(Live live) throws Exception;
		
	//SELECT ONE
	public Live getBattleStream(int liveNo) throws Exception;
		
	//DELETE BattleStream -> (주의) Update 해야 함
	public void deleteBattleStream(int liveNo) throws Exception;
		
	//addPlayer
	public void addPlayer(String userId) throws Exception;
}

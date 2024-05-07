package com.kh.QuequeEx;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePre {
	// mian
	public static void main(String[] args) {
		// 80 60 30 20 offer 추가
		// 데이터 확인 및 제거 poll
		// peek 맨 앞 데이터 확인
		// isEmpty 비어있는지 확인
		
		Queue<Integer> q = new LinkedList<>();
		
		q.offer(80);
		q.offer(60);
		q.offer(30);
		q.offer(20);
		System.out.println(q);
		
		int cr = q.poll();
		System.out.println(cr);
		
		int check = q.peek();
		System.out.println(check);
		
		boolean isEmpty = q.isEmpty();
		System.out.println(isEmpty);
		
	}
	
}

package com.kh.QuequeEx;

import java.util.LinkedList;
import java.util.Queue;

/*
Queue(큐)
	먼저 추가된 항목이 먼저 제거
	First In - First Out : 먼저 추가된 항목이 가장 먼저 제거
	데이터가 줄을 서 있는 것과 유사하며, 가장 먼저 들어간 항목이 가장 앞에 위치
	대기, 이벤트 처리
	
메서드 
	offer()   : 큐에 공간이 충분한 경우 값이 추가되고, 추가되면 true 반환
			    추가되지 못하면 예외
			    add 를 사용할 수 있지만 offer 와 마찬가지로 공간이 없으면 예외 처리가 됨
	poll()    : 값을 제거하고 반환, 만약에 비어있는 경우 null 반환
	remove()  : poll 과 동일한 기능을 수행하지만, 비어있는 경우에는 예외를 던짐
	peek()    : 맨 앞에 있는 값을 반환하지만 제거하지는 않음
	element() : peek 처럼 맨 앞에 있는 값을 반환하지만 제거하지는 않음. 단 비어있는 경우 예외를 던짐

 */
public class QueueEx {
	
	public static void main(String[] args) {
		// Queue 인터페이스 이기 때문에 직접 Queue Queue 를 사용할 수 업승ㅁ
		// Queue               LinkedList 를 사용해서 많이 작성
		Queue<Integer> 큐 = new LinkedList<>();
		
		// 큐에 데이터 추가
		큐.offer(1);
		큐.offer(2);
		큐.offer(3);
		
		// 큐에서 맨 앞 데이터를 확인 제거
		int 맨앞 = 큐.poll(); // 제일먼저 들어간 1 확인 후 제거
		System.out.println(맨앞);
		
		// 큐 맨 앞 데이터 확인
		int 데이터확인 = 큐.peek(); // 1 제거 후 가장 앞인 2
		System.out.println(데이터확인);
		
		boolean isEmpty = 큐.isEmpty();
		System.out.println(isEmpty);
		
		
		
		
		
		
		
		
	}
	
}

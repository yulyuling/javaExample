package day11;
class GStack<T> { //문자열로 만듬.


			int tos;
			Object [] stck;
			
			public GStack() {//생성자
			tos = 0; // 0값 입력
			stck = new Object [10]; //stack 오브젝트형 10;
		}
			
			public void push(T item) { 
			if(tos == 10)
			return; //push를 빠져나감
			
			stck[tos] = item; // Stack=0; tos=0; //0번째부터 넣어라.
			tos++;				// 다음에 넣을 공간.
		}
			
			public T pop() {  // 값 빼. 3부터빼
			if(tos == 0)	
			return null;	
			tos--;			// tos에서 -- 그럼 2
			return (T)stck[tos];	// 리턴해라 stck[tos] 현재값을 빼라
		}
			
	}



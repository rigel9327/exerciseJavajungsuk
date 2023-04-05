//[11-4]   LinkedList클래스는 이름과 달리 실제로는 이중 원형 연결리스트(doubly circular linked list)로 구현되어 있다.
//         LinkedList인스턴스를 생성하고 11개의 요소를 추가했을 때,
//         이 11개의 요소 중 접근시간(access time)이 가장 오래 걸리는 요소는 몇 번째 요소인가?

/*
<풀이>
이중 원형 리스트는 가장 첫 번째 노드와 마지막 노드가 서로 연결되어 있다.
1 2 3 4 5 6 7 8 9 10 11
노드에서 접근이 가장 오래 걸리는 노드는 정 중앙인 6번째 노드이다.
 */

/*
[정답] 여섯 번째 요소(LinkedList에서 제일 가운데 위치한 요소)
[해설] LinkedList는 각 요소가 서로 참조로 연결되어 있어서, n번째 요소에 접근하기 위 해서는 첫 번째 요소부터 순서대로 각 요소를 거쳐야 된다.
예를 들어 세 번째 요소에 접 근하기 위해서는 첫 번째 요소에서 두 번째 요소로, 두 번째 요소에서 세 번째 요소로 이동해야 한다.

이런 식이면 LinkedList의 마지막 요소에 접근하는 것이 시간이 제일 많이 걸릴 것 같은 데,
그렇지 않은 이유는 LinkedList가 실제로는 아래의 그림과 같은 이중 원형 연결리스 트로 되어 있기 때문이다

이중 원형 연결리스트는 첫 번째 요소와 마지막 요소를 연결해서 LinkedList의 단점인 접근성(accessibility)를 향상시킨 것이다.
이중 원형 연결리스트에서는 마지막 요소에 접근하기 위해서는 첫 번째 요소에서 한 번만 이동하면 된다.
마지막 요소에서 첫 번째 요 소에 접근하기 위해서도 역시 한 번만 이동하면 된다.
이것은 마치 Tv리모콘의 첫 번째 채널에서 채널을 감소시키면 마지막 채널로 이동하고,
마지막 채널에서 채널을 증가시키면 첫 번째 채널로 이동하는 것과 같다고 할 수 있다.

그래서 LinkedList의 제일 가운데 있는 요소가 접근시간이 가장 길다는 것을 알 수 있다.
 */
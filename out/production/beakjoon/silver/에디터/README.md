## 문제 출처

[백준 에디터](https://www.acmicpc.net/problem/1406)

## 요구 사항

1. 문자열은 길이가 N이다 영어 소문자로만 되어 있다
2. 길이는 100,000 넘지 않는다
3. 첫째줄 : 편집기에 입력되어 있는 문자열 N
4. 둘째줄 : 입력할 명령어의 개수 M
5. 셋째줄 : M개의 줄에 걸쳐 입력할 명령어가 순서대로 주어진다
6. 커서 왼쪽으로 옮김
7. D 커서 오른쪽으로 옮김
8. B 커서 왼쪽의 문자 삭제
9. P$ $를 추가한다
10. result: 모든 명령어를 수행하고 난 후 입력되어 있는 문자열 출력

## 풀이

처음에는 `pointer`라는 필드를 두고 각 조건에 따라 pointer의 값을 계산했다.
그리고 계산된 값으로, 입력된 문자열로 만든 연결리스트의 값을 추가하고 삭제 하는 등의 작업을 했다.

인텔리제이에서 테스트 했을때는 잘 작동했으나, 실제로 백준에서 돌리면 시간초과 에러가 발생했다.

이유는 LinkedList를 인덱스로 빈번하게 데이터를 변경했기 떄문이다. 포인터값이 바뀔때마다 해당 포인터를 인덱스로 해서 리스트를 추가하고 삭제하는 행위를 했는데
LinkedList에서 이런식으로 추가가 되려면 한번에 인덱스를 찾아서 넣어주는게 아니라, 순차탐색으로 한번씩 검사를 한 후에 추가가 된다.

이런 특성은 탐색에 있어 LinkedList가 ArrayList와 비교해서 갖는 단점 중 하나 이다. LinkedList는 ArrayList와 달리 연속된 공간에 데이터가 저장되는
것이 아니라, 데이터를 담고 있는 곳과 해당 데이터의 주소값을 저장하고 있는 포인터 두가지가 있다.

먼저 `LinkedList.add(index, element)` 메서드의 구현부를 보면 아래와 같다. LinkedList는 데이터를 삽입하기 위해서, index를 사용하는데 실제로는 LinkedList가 인덱스를 가지고 있지 않고 노드의 위치정보만 가지고 있기 떄문에 아래 방법으로 빈번하게 추가 삭제를 하게 되면 하나하나 찾아가는 서비스로 탐색하기 때문에 시간이 오래걸리게 된다.

```java
    public void add(int index,E element){
    checkPositionIndex(index);

    if(index==size)
    linkLast(element);
    else
    linkBefore(element,node(index));
    }
```

```java
  void linkBefore(E e, Node<E> succ) {
        // assert succ != null;
        final Node<E> pred = succ.prev;
        final Node<E> newNode = new Node<>(pred, e, succ);
        succ.prev = newNode;
        if (pred == null)
            first = newNode;
        else
            pred.next = newNode;
        size++;
        modCount++;
    }
```

## Listiterator로 해결

위의 방식처럼 `add(index,ele)`를 사용하면 단방향 탐색, 순차탐색을 하게 되는데, Listiterator를 활용하면 양방향 탐색이 가능하기 떄문에 보다 성능을 올릴 수 있게 된다.

Listiterator를 활용하면 하나하나 찾아가서 탐색하는 것이 아니라, 원하는 위치에 있으면서 양방향으로 탐색을 할 수 있게 된다.

Listiterator는 Collection의 `iterator` 인터페이스를 확장하고 있는  interface니다. LinkedList는 해당 인터페이스에 따라 구현한 `listiterator()`메소드를 사용하면, 전체 대상을 한번씩 반복해서 가져오는 반복자를 구현할 수 있다.

사용법은 아래와 같다.

```java
    // 연결 리스트 생성
    LinkedList<String> strList = new LinkedList<>();

    // 처음 커서는 맨뒤

    for (String string : inputString.split("")) {
      strList.add(string);
    }
    ListIterator<String> iter = strList.listIterator(strList.size());

```

위와 같이 생성하면 `strList`의 사이즈만큼의 숫자를 인덱스로 가지고 있어서, iterator의 위치는 list의 맨 끝이 된다.

`에디터`문제에서는 커서가 처음에 문자열의 맨끝에 있었다고 했으므로, 리스트의 맨마지막 인덱스로 세팅 해주었다.

그리고 interator의 `hasNext()`, `remove()`, `add()`, `previous()`, `next()`를 사용하여 커서의 위치를 이동했다.

이렇게 수정하고 나서는 시간 초과 에러를 해결 할 수 있었다!

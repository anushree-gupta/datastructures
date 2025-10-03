# Graph Algorithms: BFS and DFS

This README provides an overview of two fundamental graph traversal algorithms: Breadth-First Search (BFS) and Depth-First Search (DFS). Both algorithms can be implemented using iterative and recursive approaches. We will also discuss their time and space complexities.

## Table of Contents
- [Breadth-First Search (BFS)](#breadth-first-search-bfs)
    - [Iterative Implementation](#iterative-implementation)
    - [Time and Space Complexity](#time-and-space-complexity)
- [Depth-First Search (DFS)](#depth-first-search-dfs)
    - [Recursive Implementation](#recursive-implementation)
    - [Iterative Implementation](#iterative-implementation-1)
    - [Time and Space Complexity](#time-and-space-complexity-1)

## Breadth-First Search (BFS)

BFS is an algorithm for traversing or searching tree or graph data structures. It starts at a selected node (the 'root') and explores all of its neighbor nodes at the present depth prior to moving on to nodes at the next depth level.

### Iterative Implementation

```python
from collections import deque

def bfs(graph, start):
        visited = set()
        queue = deque([start])
        
        while queue:
                vertex = queue.popleft()
                if vertex not in visited:
                        visited.add(vertex)
                        print(vertex)
                        queue.extend(neighbor for neighbor in graph[vertex] if neighbor not in visited)
```

### Time and Space Complexity

- **Time Complexity**: O(V + E), where V is the number of vertices and E is the number of edges.
- **Space Complexity**: O(V), for storing the visited nodes and the queue.

## Depth-First Search (DFS)

DFS is another algorithm for traversing or searching tree or graph data structures. It starts at the root (or an arbitrary node) and explores as far as possible along each branch before backtracking.

### Recursive Implementation

```python
def dfs_recursive(graph, vertex, visited=None):
        if visited is None:
                visited = set()
        visited.add(vertex)
        print(vertex)
        for neighbor in graph[vertex]:
                if neighbor not in visited:
                        dfs_recursive(graph, neighbor, visited)
```

### Iterative Implementation

```python
def dfs_iterative(graph, start):
        visited = set()
        stack = [start]
        
        while stack:
                vertex = stack.pop()
                if vertex not in visited:
                        visited.add(vertex)
                        print(vertex)
                        stack.extend(neighbor for neighbor in graph[vertex] if neighbor not in visited)
```

### Time and Space Complexity

- **Time Complexity**: O(V + E), where V is the number of vertices and E is the number of edges.
- **Space Complexity**: O(V) for the visited set and O(h) for the recursion stack in the recursive version, where h is the maximum height of the recursion stack.

## Conclusion

Both BFS and DFS are essential algorithms for graph traversal, each with its own use cases and characteristics. Understanding their implementations and complexities is crucial for effective problem-solving in graph-related tasks.

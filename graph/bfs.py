from collections import deque

graph = {"a": [ "c","b"], "b": ["d"], "c": ["e"], "d": ["f"], "e": [], "f": []}


def bfs(graph, start):
    print("BFS Traversal:")
    print("--------------")
    queue = deque([start])
    while queue:
        current = queue.pop()
        print(current)
        for neighbor in graph[current]:
            queue.append(neighbor)


# def bfs_recursive(graph, start):

#   print(start)
#   for neighbour in graph[start]:
#     bfs_recursive(graph, neighbour)

bfs(graph, "a")

# bfs_recursive(graph, "a")

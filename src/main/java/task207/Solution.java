package task207;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    static boolean[] visited;
    static boolean[] path;
    static HashMap<Integer, List<Integer>> graph;
    static boolean hasCycle = false;

    // Нужно проверить, есть ли циклы в графе
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        // Хэшмапа со списком смежных вершин грфа
        graph = new HashMap<>(numCourses);
        // Заполняю граф
        for (int[] prerequisite : prerequisites) {
            List<Integer> vert = graph.get(prerequisite[0]);
            if (vert == null) graph.put(prerequisite[0], new ArrayList<>());
            graph.get(prerequisite[0]).add(prerequisite[1]);
        }
        // Список уже посещённых вершин
        visited = new boolean[numCourses];
        Arrays.fill(visited, false);

        // Список вершин из текущего пути
        path = new boolean[numCourses];
        Arrays.fill(path, false);

        // Прохожусь в глубину относительно каждой вершины. Если в процессе обхода возвращаюсь в вершину из текущегшо
        // пути, цикл есть
        for (int vert : graph.keySet()) {
            dfs(vert);
        }
        return !hasCycle;
    }

    public static void dfs(int curr) {
        // Если текущую вершину уже прошли в этом проходе, есть цикл
        if (path[curr]) {
            hasCycle = true;
            return;
        }
        // Если уже посещал вершину, но не в текущем проходе, проход по ней не дал цикл, значит её можно не перебирать
        if (visited[curr] || hasCycle) return;
        // Помечаю вершины
        path[curr] = true;
        visited[curr] = true;
        if (graph.get(curr) != null){
            for (int neighbour : graph.get(curr)) {
                dfs(neighbour);
            }
        }
        // Когда перебрал все пути для текущеё вершины, удаляю её из текущего пути
        path[curr] = false;
    }

    public static void main(String[] args) {
        int[][] prerequisites1 = {{1, 0}};
        System.out.println(canFinish(2, prerequisites1));

        int[][] prerequisites2 = {{1, 0}, {0, 1}};
        //System.out.println(canFinish(2, prerequisites2));

        int[][] prerequisites3 = {};
        //System.out.println(canFinish(1, prerequisites3));

        int[][] prerequisites4 = {{0, 1}};
        //System.out.println(canFinish(1, prerequisites3));
    }
}

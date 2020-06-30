class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String,String> cityMap = initMap(paths);
        String from = paths.get(0).get(0);

        while(true) {
            if (!cityMap.containsKey(from)) {
                return from;
            }
            from = cityMap.get(from); // 即为走到了下一个城市。
        }
    }
    public Map<String,String> initMap(List<List<String>> paths) {

        Map<String,String> cityMap = new HashMap<>();

        // 我们用map的key代表目前城市，用value表示可以到达的城市
        for (List<String> path : paths) {
            cityMap.put(path.get(0),path.get(1));
        }

        return cityMap;
    }
}
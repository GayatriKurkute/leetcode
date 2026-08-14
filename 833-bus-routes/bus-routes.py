from collections import defaultdict, deque
class Solution:
    def numBusesToDestination(self, routes, source, target):
        if source == target:
             return 0
        stop_to_buses = defaultdict(list)
        for bus, route in enumerate(routes):
            for stop in route:
                stop_to_buses[stop].append(bus)
        queue = deque()
        visited_buses = set()
        visited_stops = set()
        for bus in stop_to_buses[source]:
            queue.append((bus, 1))
            visited_buses.add(bus)
        while queue:
            bus, buses_taken = queue.popleft()
            for stop in routes[bus]:
                if stop == target:
                    return buses_taken
                if stop in visited_stops:
                    continue
                visited_stops.add(stop)
                for next_bus in stop_to_buses[stop]:
                    if next_bus not in visited_buses:
                        visited_buses.add(next_bus)
                        queue.append((next_bus, buses_taken + 1))
        return -1
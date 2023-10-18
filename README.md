# CarRacing-1
A group of drivers competes in a qualifying race, where a predetermined number of cars C will race on a track R meters long.
Each of the C cars has a set of technical characteristics that set it apart from the others, in particular:
    • Cid: the car’s identifier, starting from 0
    • Cs: the car’s normal speed, in meters per second
    • Ct
    : the car’s turbo speed, in meters per second
    • Cc: the car’s turbo boost cooldown time, in seconds
    • Cd: the car’s turbo boost duration time, in seconds
    
The race takes place in rounds of one second each, where each car will instantly advance at its current
speed in meters per second.

Each car has a normal speed of Cs meters per second and the ability to active a turbo boost for a limited
period, enabling the car to reach a speed of Ct meters per second.

When activated, the turbo boost is used continuously for Cd seconds, after which the car will need Cc
seconds to recharge beore it can use the turbo boost again.

  Note: the turbo boost can be used any amount of time if fully recharged. Every car will start the race with a fully charged and ready-to-use turbo boost.

Calculate which vehicle will complete the race first, bearing in mind that each driver will do their best
to win. In the case of a tie, the driver with the lower identifier will be declared the winner.

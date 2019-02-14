# CCC
Doing some CCC practice, will post here.

I'm a complete amateur in programming and even more of an amateur in competitive programming. This is a learning experience, so follow along. I will update the README.md with any information that I found interesting.

Doing this on NetBeans IDE, so to send it to CCCGrader, I had to change the main method to Main and remove the package line.


CCC2018S1: Logic wasn't hard but what the hell was this printing problem I had? Shoutout to Felix and Vert, they told me that I needed to format the doubles to just .1 with:
System.out.printf("%.1f", neighbourhood[0]);

CCC2000S1J3: Apart from mixing up += and =+, there weren't problems with the simulation itself. The problem came with TLEing; case two and three simply took too long. It was my first encounter with problems like those, and it sucked.

CCC2017S1: I need to try some more than S1s, but S1s and S2s still take too much time for me to solve I think. The logic was simple, I just had to learn some things about input. BufferedReader reduces time, I need to use StringTokenizer to split numbers with spaces, and need to refresh after every line. Comments have been made on the source code for this.

CCC2002J2: Yeah this one is a J2. It's a simple strings one, but I suck at strings, so this helps. It's a good ease into learning about substrings, charAt, length, etc.

CCC2017S2: Yep, I made this too complicated. I'll look into it again. Logic isn't hard, just implementation with arrays. Will keep posting about it.

CCC2016S2: Easiest one there is.

CCC2012S1: HUGE wake-up call to relearn combinatorics. I had to get help from friends for this one since I just completely blanked out. n = jerseys - 1  and k = 3.

CCC2017J3: Nothing tough, just some basic implementation.

CCC2014S1: It's a pretty hard S1; at least, it made me THINK the most. I learned about arraylists! That was cool.

CCC2015S1: More arraylists. Easy. I'm getting stuck on a J3. I'm trying to use recursion. Will keep updating.

CCC2012S2: I should have used switches, but it doesn't really matter. Anyways, I tried using a couple methods, but this last one keeps the conditions fine. I was actually having trouble with it until I realized I had to put the first condition in the && to make sure it doesn't check the second one which goes out of index. You can see it in the last few lines.

CCC2011S1: Easy string question, and I suck at strings.

CCC2010S1: I hate this damn question. I tried solving it with arrays, but then I get WAs for some middle cases but get a couple right (including the last one). I tried to match every index with a name, score, etc., but for some reason my logic checked out for only a couple cases. Frustrated, I just removed arrays, used one Arraylist to keep track of the names, and just stored variables given sets of conditions. This was not the hardest; it was simple the most frustrating.

CCC2016S1: The infamous Ragaman. This solution is much easier if you know how ASCII tables work. Felix has a much better response since he's a genius (https://github.com/FelixHe4/Competitive-Programming/blob/master/CCC/ccc16s1.java).

CCC2009S1: The dreaded floating point error issue. Test case 3 had a number (inputted as a and b) which was a prime and was pretty large, so I used Decimal Format to make it a couple decimal places, parsed that String for that double, and checked if it was able to be an integer. This was only used for the special case that the numbers are zero. I used Math.floor and Math.ceil to find the integers within a range of numbers to the 6th power. This one frustrated me.

CCC2008S1: I'm an idiot, Cathy was right: I didn't need to put the constructor there since there's no input needed. Thanks! I guess I'm not breaking up with StringTokenizer.

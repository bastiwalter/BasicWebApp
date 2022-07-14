package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "MyTeam";
        } else if (query.contains("which of the following numbers is the largest")) {
            String[] a = query.trim().split(":");
            String numbers = a[2];
            String[] ints = numbers.split(",");
            int[] res = new int[ints.length];
            for (int i = 0; i < ints.length; ++i) {
                res[i] = Integer.parseInt(ints[i]);
            }
            int b;
            int max = res[0];
            for (b = 1; b < res.length; b++)
                if (res[b] > max)
                    max = res[b];
            return String.valueOf(max);
        } else {
            return "";
        }
    }
}

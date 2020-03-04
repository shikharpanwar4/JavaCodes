package com.company;

import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=0;
        n = in.nextInt();

        vector<pair<Integer, String>> v;
        for(int i=0; i<n; i++){
            string s;
            int a=0, b=0, c=0;
            cin >> s >> a >> b >> c;
            vector<int> vi;
            int temp = 0;
            temp = a+b+c;
            v.push_back(make_pair(temp,s));
        }
        sort(v.begin(), v.end(), greater<>());
        for(int i=0; i<v.size(); i++){
            cout << i+1 << " " << (v[i]).second << endl;
        }

    }
}

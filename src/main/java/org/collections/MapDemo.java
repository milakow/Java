package org.collections;

import java.util.HashMap;
import java.util.Map;
public class MapDemo {
    public void main(String[] args) {
        Map<String, Account> accounts = new HashMap<>();
        //you specify key - value pairs
        // keys are unique
        //you can think about it like it is List where you decide how indexes works and what is it's type
        accounts.put("a@b", new Account("a@b", "Jan"));
        accounts.put("b@c", new Account("b@c", "Beata"));
        accounts.put("a@b", new Account("a@b", "Adam"));
        System.out.println(accounts);

        //you cannot iterate on maps directly, you have to get key, value or entry collections
        for (String email : accounts.keySet()) {
            System.out.println(email);
            System.out.println(accounts.get(email));
        }

        for (Account value : accounts.values()) {
            System.out.println(value);
        }

        for (Map.Entry<String, Account> entry : accounts.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            entry.setValue(new Account("aaa@bbb", "Test")); //you can change value using entry
        }

        System.out.println(accounts);


    }

    class Account {
        private String email;
        private String username;

        public Account(String email, String username) {
            this.email = email;
            this.username = username;
        }

        @Override
        public String toString() {
            return "Account{" +
                    "email='" + email + '\'' +
                    ", username='" + username + '\'' +
                    '}';
        }
    }
}

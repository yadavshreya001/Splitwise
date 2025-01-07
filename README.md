# Splitwise Application 💸

A backend implementation of a Splitwise-like application designed to simplify expense sharing among friends, roommates, or any group! 🎉 Whether it's splitting dinner bills 🍕, rent 🏠, or a shared trip 🛫, this app automates the process of balancing out who owes whom and how much.

## Features 🌟

- Expense Management 💰: Effortlessly add, edit, or delete expenses to keep track of all shared costs.
  
- Automatic Balance Calculation 📊: The app automatically calculates who owes what, reducing the need for manual calculation.

- Group Creation 👥: Easily create and manage groups for specific events, trips, or shared living arrangements.

- Multiple Split Options 🔢:

    - Equal Split: Divide the total amount equally among all members.

    - Exact Amount: Specify an exact amount for each participant to pay.

    - Percentage Split: Split expenses based on a percentage contribution.

    - Ratio Split: Divide expenses by defined ratio parts.
 
- Multi-Payment Support 💳: Allows multiple users to split costs with individual contributions.

- Scalable Architecture 📈: Designed to handle multiple users and large groups without performance issues.

- Settle-Up 💸: Users can request a settle-up, where the app shows the list of transactions to ensure everyone is paid back.

- Group Management 🏘️: Users can create groups, add/remove members, and view group-specific balances.

- Transaction History 🧾: View a full history of all expenses the user is involved in.

## Tech Stack ⚙️

- Java ☕

- Spring Boot 🚀

- Hibernate 🧱

- MySQL 🗄️

- JPA 🔍

## Requirements 🚨

  Core Requirements:

- User Profiles:

  - Users can register, update their profiles (including name, phone number, and password), and view their profiles.
    
  - Users can participate in expenses with other users and join groups.

- Adding Expenses:

  - Users can specify the group or participants involved in the expense.

  - Expenses can be split in different ways (equal, percentage, ratio, exact amount, or multi-pay).

  - Each expense will also require a description.

- Balances:

  - Users can see their total owed amount and view their expense history.

  - A user can view the history of expenses for each group they are part of.

- Groups:

  - A user can create a group and add/remove members, but only the group creator can manage members.

  - Users cannot query details of groups they are not members of.

- Settle-Up:

  - A user can request a settle-up, which will show a list of transactions needed to clear debts.

  - Users can also request a settle-up for any group they are part of to clear group-specific debts.

- Transaction Minimization:

  - When settling debts, the application aims to minimize the number of transactions needed for settlement.

## Input Format


Register vinsmokesanji 003 namisswwaann

> u1 is registering with the username "vinsmokesanji", phone "003" and password as "namisswwaann"
-- --
u1 UpdateProfile robinchwan

> u1 is updating their profile password to "robinchwan"
-- --
u1 AddGroup Roommates

> u1 is creating a group titled "Roommates"
-- --
u1 AddMember g1 u2

> u1 is adding u2 as a member of the group "Roommates" (which has the id g1)
-- --
u1 MyTotal
> u1 is asking to see the total amount they owe/recieve after everything is settled.
-- --
u1 History
> u1 is asking to see their history of transactions (whether added by themselves or someone
else)
-- --
u1 Groups
> u1 is asking to see the groups that they're a member of
-- --
u1 SettleUp
> u1 is asking to see the list of transactions they should perform to settle up
-- --
u1 SettleUp g1
> u1 is asking to see the list of transactions that need to be performed by members of g1 to
completely settle up the group.
-- --
u1 Expense g1 iPay 1000 Equal Desc Wifi Bill
> u1 is adding an expense in the group g1.
> u1 paid 1000 Rs
> each user of g1 owes an equal amount (the exact amount will depend on the number of users in group g1. Say g1 has 5
users, then the amount owed by each will be 200Rs).
-- --
u1 Expense u2 u3 u4 iPay 1000 Equal Desc Last night dinner
> u1 is adding an expense with users u2, u3 and u4.
> u1 paid 1000 Rs
> each user owes an equal amount - 250Rs.
-- --
u1 Expense u2 u3 iPay 1000 Percent 20 30 50 Desc House rent
> u1 is adding an expense with users u2 and u3
> u1 paid 1000 Rs
> u1 owes 20% (200Rs), u2 owes 30% (300Rs) and u3 owes 50% (500Rs).
-- --
u1 Expense u2 u3 u4 iPay 1000 Ratio 1 2 3 4 Desc Goa trip
> u1 is adding an expense with users u2, u3 and u4.
> u1 paid 1000 Rs
> u1 owes 100Rs (1 part), u2 owes 200Rs (2 parts), u3 owes 300Rs (3 parts) and u4 owes 400Rs (4
parts).
-- --
u1 Expense u2 u3 iPay 1000 Exact 100 300 600 Desc Groceries
> u1 is adding an expense with users u2 and u3.
> u1 paid 1000 Rs
> u1 owes 100Rs, u2 owes 300Rs and u3 owes 600Rs.
-- --
u1 Expense u2 u3 MultiPay 100 300 200 Equal Desc Lunch at office
> u1 is adding an expense with users u2 and u3.
> u1 paid 100 Rs, u2 paid 300Rs and u3 paid 200Rs.
> Each user owes an equal amount - 200Rs.
-- --
u1 Expense u2 u3 MultiPay 500 300 200 Percent 20 30 50 Desc Netflix subscription
> u1 is adding an expense with users u2 and u3.
> u1 paid 500 Rs, u2 paid 300Rs and u3 paid 200Rs.
> u1 owes 20% (200Rs), u2 owes 30% (300Rs) and u3 owes 50% (500Rs).

-- --


u1 can add an expense what other users?
- either from a group - g1
- specific people - u2 u3 u4

who paid
- iPaid amount
- Multipay a1 a2 a3 ...

who owes what
- equal
- by percentage
- by ratio
- exact amount: 100/3

- make the reasonable assumptions 100/3 = 33.33 assign one person 33.34 and the rest 33.33

u1 Expense g1 iPay 1000 Percentage 10 20 30 40

Assume that the members in the group are organised by their userids in ascending order

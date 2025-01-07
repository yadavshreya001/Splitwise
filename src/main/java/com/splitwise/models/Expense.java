package com.splitwise.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "expenses")
public class Expense extends BaseModel {
    private String description;
    private int amount;

    @ManyToOne
    private User createdBy;

    @Enumerated(EnumType.ORDINAL)
    private ExpenseType expenseType;

    @OneToMany
    private List<ExpenseUser> expenseUsers;
}


/*


  1                 1
Expense ---------- User => M:1
 M                  1


ExpenseUser ---- Expense => M:1
 */
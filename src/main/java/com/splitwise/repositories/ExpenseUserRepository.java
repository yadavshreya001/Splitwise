package com.splitwise.repositories;

import com.splitwise.models.ExpenseUser;
import com.splitwise.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExpenseUserRepository extends JpaRepository<ExpenseUser, Long> {

    List<ExpenseUser> findByUser(User user);
}

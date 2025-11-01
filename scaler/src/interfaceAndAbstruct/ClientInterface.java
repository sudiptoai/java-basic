package interfaceAndAbstruct;
//| Use Case                                                                  | Interface | Abstract Class |
//| ------------------------------------------------------------------------- | --------- | -------------- |
//| **Define behavior contract** (e.g., PaymentGateway)                       | ✅         | ❌            |
//| **Share common data or state** (e.g., Employee base class)                | ❌         | ✅            |
//| **Unrelated classes sharing same behavior** (e.g., Notification channels) | ✅         | ❌            |
//| **Classes with shared code and fields** (e.g., Vehicles with attributes)  | ❌         | ✅            |
//| **Allow multiple inheritance** of type                                    | ✅         | ❌            |
//| **Create partial implementation / templates**                             | ❌         | ✅            |


//| Feature                                 | Interface               | Abstract Class | Why Abstract Wins for Employee Hierarchy  |
//| --------------------------------------- | ----------------------- | -------------- | ----------------------------------------- |
//| Can hold instance fields                | ❌ No                   | ✅ Yes         | Employees have names, salaries, IDs       |
//| Can provide full/partial implementation | ⚠️ Default methods only | ✅ Yes         | Common methods like `showDetails()`       |
//| Code reuse                              | ❌ No                   | ✅ Yes         | Avoid duplicating logic in every subclass |
//| Represents “can do” capability          | ✅ Yes                  | ⚠️ Not ideal   | Employees *are* entities, not behaviors   |
//| Suitable for hierarchical models        | ❌ No                   | ✅ Yes         | FullTimeEmployee **is-an** Employee       |

public interface ClientInterface {
    void whatCanDo();
}

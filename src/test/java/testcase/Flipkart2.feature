Feature: Search

@search2
Scenario: verify the search funcation
Given User should be landed on Flipkart site.
When user Enter "Eyrwear" on search element.
Then validate search element by title of the page.

@multiSearch2
Scenario Outline: Verify the search Function with multiData
Given User should be landed on Flipkart site
When User Enter "<product_Search>" on serach element.
Then Validate seach element by "<expected_Title>" of the page.

Examples:
| product_search | expected_Title |
| laptop 				 | Laptop         |
| mobile         | demo           |
| smart watch    | Smart watch    |

	  
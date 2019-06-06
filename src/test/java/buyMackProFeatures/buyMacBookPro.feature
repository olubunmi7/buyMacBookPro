Feature: Buy a MacBook from the Apple UK website
  As an online customer, I want to choose a MacBook Pro with accessories from the Apple UK website
  So that I can purchase it online

  Scenario: A customer can order a 15" MacBook Pro with accessories from the Apple UK website

            Given that a user launches the url
            When a user chooses a MacBook Pro with the following features and accessories
              | Option          |        Specification |
              | Screen          |                 15’’ |
              | Processor       |              2.6 GHz |
              | Memory RAM      |                16 GB |
              | Colour          |               Silver |
              | Software        |          Logic Pro X |
              | Display adapter | USB-C to USB Adapter |
            Then I can place an order for it


    Scenario: The correct price and VAT are displayed for the 15" MacBook Pro with accessories
            Given when I choose the following items:
              | Option                   	| Price_in_£ |
              | MacBook Pro and software 	|    2548.99 |
              | USB-C to USB Adapter        |      19.00 |

            When I proceed to the checkout
            Then a total price of £2548.99
            And £428.00 will be listed for VAT

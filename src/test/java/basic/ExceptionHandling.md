# WebDriver Exception
All runtime exception classes in Selenium WebDriver come under the superclass WebDriverException.

The most common exceptions under WebDriverException class are:

1. **NoSuchElementException** - the element is not found during runtime using FindBy method
2. **StaleElementReferenceException** - the referenced element is no longer present on the DOM page
3. **NoSuchWindowException** - switching to an invalid window
4. **InvalidSelectorException** - wrong or invalid selector used to find an element
5. **ElementNotSelectableException** - the element present but disabled in the DOM
6. **TimeoutException** - the element didn’t display in the specified time
7. **NoSuchFrameException** - switching to an invalid frame
8. **NoAlertPresentException** - switching to an invalid alert
9. **ElementNotVisibleException** - when an element is present in the DOM but cannot be interacted with, e.g., Hidden Elements

# Handling exceptions
1. Using try/catch block
2. Using WebDriver waits (Implicit, Explicit, and Fluent)
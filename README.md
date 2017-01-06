# Java DSL for Vaadin

A domain-specific language (DSL) describing how to create Vaadin components, set their properties and compose layouts in pure Java.

## Getting started

Here is a simple example on how to try out the add-on component:

```java
CssLayout root = cssLayout(
    sizeFull(),
    textField(
        caption("Username"),
        sizeUndefined()),
    passwordField(
        caption("Password"),
        sizeUndefined()),
    horizontalLayout(
        button(
            caption("Ok"),
            onButtonClick(EventBus::onOkButtonClick)),
        button(
            caption("Cancel"),
            onButtonClick(EventBus::onCancelButtonClick))))
    .get();
```

For a more comprehensive example, see src/test/java/org/vaadin/addons/demo/dsl/DemoUI.java

## Features

This DSL is based on the inner DSL by Nested Functions approach to reflect the hierarchic nature of Vaadin components composition (Basically, we nest functions within functions to populate the sematic model).

### Semantic Model

The semantic model is represented as a tree of nodes being either property setter or component builder.

A ComponentNode describes the state of a component node in the semantic model. It contains:
- a list of child ComponentNode,
- a list of type safe PropertyNode (either property setter or event listener),
- an opional reference to the component for later use.

A PropertyNode is a functional interface that applies the result of an property setter or event listener function to the component.

### Components API

The Components class contains generated static functions for creating ComponentNodes for Vaadin Components. These helper functions can take an array of PropertyNodes applicable for this component as argument.

### ComponentContainers API

The ComponentContainers class contains generated static functions for creating ComponentNodes. These helper functions can take an array of Nodes (either ComponentNodes or PropertyNodes) as argument.

### Property setter API

The Properties class contains generated static functions for creating PropertyNodes. These helper functions are named by removing the "set" prefix, e.g. "visible(...)" instead of "setVisible(...)", "styleName(...)" instead of "setStyleName(...)" and so on. They take the same arguments as the underliyng function.

### Event Listener API

The Listeners class contains generated static functions for creating PropertyNodes. These helper functions are named by replacing the "add" prefix with an "on" prefix and removing the "Listener" suffix, e.g. "onBlur(...)" instead of "addBlurListener(...)". They take the same arguments as the underliyng function.

## Download release

Official releases of this add-on are available at Vaadin Directory. For Maven instructions, download and reviews, go to http://vaadin.com/addon/java-dsl

## Building and running demo

git clone https://github.com/mouellet/vaadin-java-dsl.git
mvn clean install
cd demo
mvn jetty:run

To see the demo, navigate to http://localhost:8080/

## Development with Eclipse IDE

For further development of this add-on, the following tool-chain is recommended:
- Eclipse IDE
- m2e wtp plug-in (install it from Eclipse Marketplace)
- Vaadin Eclipse plug-in (install it from Eclipse Marketplace)
- Chrome browser

### Importing project

Choose File > Import... > Existing Maven Projects

Note that Eclipse may give "Plugin execution not covered by lifecycle configuration" errors for pom.xml. Use "Permanently mark goal resources in pom.xml as ignored in Eclipse build" quick-fix to mark these errors as permanently ignored in your project. Do not worry, the project still works fine. 

## Release notes

### Version 0.0.1
- Initial release

## Roadmap

This component is developed as a hobby with no public roadmap or any guarantees of upcoming releases. That said, the following features are planned for upcoming releases:
- Better code generator for components and properties.
- DSL for data binding.

## Issue tracking

The issues for this add-on are tracked on its github.com page. All bug reports and feature requests are appreciated. 

## Contributions

Contributions are welcome, but there are no guarantees that they are accepted as such. Process for contributing is the following:
- Fork this project
- Create an issue to this project about the contribution (bug or feature) if there is no such issue about it already. Try to keep the scope minimal.
- Develop and test the fix or functionality carefully. Only include minimum amount of code needed to fix the issue.
- Refer to the fixed issue in commit
- Send a pull request for the original project
- Comment on the original issue that you have implemented a fix for it

## License & Author

Distributed under Apache License 2.0. For license terms, see LICENSE.txt.

Java DSL for Vaadin is written by Mathieu Ouellet

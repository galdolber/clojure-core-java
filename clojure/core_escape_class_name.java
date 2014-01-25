package clojure;

import clojure.lang.*;

public final class core_escape_class_name extends clojure.lang.AFunction {
 static {
 }
 public core_escape_class_name() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object c1) {
  return ((java.lang.String)((java.lang.String)((java.lang.String)((java.lang.Class)c1).getSimpleName())).replace((java.lang.CharSequence)((java.lang.CharSequence)"[]"), (java.lang.CharSequence)((java.lang.CharSequence)"<>")));
 }
}

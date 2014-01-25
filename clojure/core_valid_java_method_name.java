package clojure;

import clojure.lang.*;

public final class core_valid_java_method_name extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "=");
 }
 public core_valid_java_method_name() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  return (clojure.lang.Util.equiv(((java.lang.Object)s1), ((java.lang.Object)((java.lang.String)clojure.lang.Compiler.munge((java.lang.String)((java.lang.String)s1))))) ? Boolean.TRUE : Boolean.FALSE);
 }
}

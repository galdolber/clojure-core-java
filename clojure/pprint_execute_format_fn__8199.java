package clojure;

import clojure.lang.*;

public final class pprint_execute_format_fn__8199 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "execute-format");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "identical?");
 }
 Object args3;
 Object format2;
 Object real_stream4;
 Object wrapped_stream6;
 public pprint_execute_format_fn__8199(final Object args3, final Object format2, final Object real_stream4, final Object wrapped_stream6) {
  super();
  this.args3 = args3;
  this.format2 = format2;
  this.real_stream4 = real_stream4;
  this.wrapped_stream6 = wrapped_stream6;
 }
 public java.lang.Object invoke() {
  try {
   try {
    return ((IFn)const__0.getRawRoot()).invoke(this.format2, this.args3);
   } finally {
    Object __r5876 = ((IFn)const__1.getRawRoot()).invoke((clojure.lang.Util.identical(((java.lang.Object)this.real_stream4), ((java.lang.Object)this.wrapped_stream6)) ? Boolean.TRUE : Boolean.FALSE));
    if (__r5876 != null && !(__r5876 == Boolean.FALSE)) {
     ((java.io.Writer)this.wrapped_stream6).flush();
    } else {
    }
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}

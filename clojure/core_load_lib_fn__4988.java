package clojure;

import clojure.lang.*;

public final class core_load_lib_fn__4988 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "remove-ns");
 }
 Object load18;
 Object lib5;
 Object undefined_on_entry22;
 Object need_ns20;
 Object require11;
 public core_load_lib_fn__4988(final Object load18, final Object lib5, final Object undefined_on_entry22, final Object need_ns20, final Object require11) {
  super();
  this.load18 = load18;
  this.lib5 = lib5;
  this.undefined_on_entry22 = undefined_on_entry22;
  this.need_ns20 = need_ns20;
  this.require11 = require11;
 }
 public java.lang.Object invoke() {
  try {
   return ((IFn)this.load18).invoke(this.lib5, this.need_ns20, this.require11);
  }
  catch (Throwable ex___) {
   if (ex___ instanceof java.lang.Exception) {
    java.lang.Exception e3 = (java.lang.Exception) ex___;
    Object __r3148 = this.undefined_on_entry22;
    if (__r3148 != null && !(__r3148 == Boolean.FALSE)) {
     ((IFn)const__0.getRawRoot()).invoke(this.lib5);
    } else {
    }
    Util.trow((Throwable)e3);
    return null;
   }
   else {
    throw Util.sneakyThrow(ex___);
   }
  }
 }
}

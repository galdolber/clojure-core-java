package clojure;

import clojure.lang.*;

public final class core_some_fn_sp2__6490 extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "some");
 }
 Object p11;
 Object p22;
 public core_some_fn_sp2__6490(final Object p11, final Object p22) {
  super();
  this.p11 = p11;
  this.p22 = p22;
 }
 public java.lang.Object doInvoke(java.lang.Object x1, java.lang.Object y2, java.lang.Object z3, java.lang.Object args4) {
  {
   Object or__3968__auto__5 = ((IFn)this).invoke(x1, y2, z3);
   Object __r4254 = or__3968__auto__5;
   if (__r4254 != null && !(__r4254 == Boolean.FALSE)) {
    return or__3968__auto__5;
   } else {
    return ((IFn)const__0.getRawRoot()).invoke(new clojure.core_some_fn_sp2__6490_fn__6491(this.p11, this.p22), args4);
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2, java.lang.Object z3) {
  {
   Object or__3968__auto__4 = ((IFn)this.p11).invoke(x1);
   Object __r4256 = or__3968__auto__4;
   if (__r4256 != null && !(__r4256 == Boolean.FALSE)) {
    return or__3968__auto__4;
   } else {
    {
     Object or__3968__auto__5 = ((IFn)this.p11).invoke(y2);
     Object __r4258 = or__3968__auto__5;
     if (__r4258 != null && !(__r4258 == Boolean.FALSE)) {
      return or__3968__auto__5;
     } else {
      {
       Object or__3968__auto__6 = ((IFn)this.p11).invoke(z3);
       Object __r4260 = or__3968__auto__6;
       if (__r4260 != null && !(__r4260 == Boolean.FALSE)) {
        return or__3968__auto__6;
       } else {
        {
         Object or__3968__auto__7 = ((IFn)this.p22).invoke(x1);
         Object __r4262 = or__3968__auto__7;
         if (__r4262 != null && !(__r4262 == Boolean.FALSE)) {
          return or__3968__auto__7;
         } else {
          {
           Object or__3968__auto__8 = ((IFn)this.p22).invoke(y2);
           Object __r4264 = or__3968__auto__8;
           if (__r4264 != null && !(__r4264 == Boolean.FALSE)) {
            return or__3968__auto__8;
           } else {
            return ((IFn)this.p22).invoke(z3);
           }
          }
         }
        }
       }
      }
     }
    }
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2) {
  {
   Object or__3968__auto__3 = ((IFn)this.p11).invoke(x1);
   Object __r4266 = or__3968__auto__3;
   if (__r4266 != null && !(__r4266 == Boolean.FALSE)) {
    return or__3968__auto__3;
   } else {
    {
     Object or__3968__auto__4 = ((IFn)this.p11).invoke(y2);
     Object __r4268 = or__3968__auto__4;
     if (__r4268 != null && !(__r4268 == Boolean.FALSE)) {
      return or__3968__auto__4;
     } else {
      {
       Object or__3968__auto__5 = ((IFn)this.p22).invoke(x1);
       Object __r4270 = or__3968__auto__5;
       if (__r4270 != null && !(__r4270 == Boolean.FALSE)) {
        return or__3968__auto__5;
       } else {
        return ((IFn)this.p22).invoke(y2);
       }
      }
     }
    }
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  {
   Object or__3968__auto__2 = ((IFn)this.p11).invoke(x1);
   Object __r4272 = or__3968__auto__2;
   if (__r4272 != null && !(__r4272 == Boolean.FALSE)) {
    return or__3968__auto__2;
   } else {
    return ((IFn)this.p22).invoke(x1);
   }
  }
 }
 public java.lang.Object invoke() {
  return null;
 }
 public int getRequiredArity() {
  return 3;
 }
}

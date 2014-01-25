package clojure;

import clojure.lang.*;

public final class core_every_pred_ep3__6441 extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "boolean");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "every?");
 }
 Object p11;
 Object p22;
 Object p33;
 public core_every_pred_ep3__6441(final Object p11, final Object p22, final Object p33) {
  super();
  this.p11 = p11;
  this.p22 = p22;
  this.p33 = p33;
 }
 public java.lang.Object doInvoke(java.lang.Object x1, java.lang.Object y2, java.lang.Object z3, java.lang.Object args4) {
  Object __r4186 = null;
  {
   Object and__3966__auto__5 = ((IFn)this).invoke(x1, y2, z3);
   Object __r4187;
   Object __r4188 = and__3966__auto__5;
   if (__r4188 != null && !(__r4188 == Boolean.FALSE)) {
    __r4187 = ((IFn)const__1.getRawRoot()).invoke(new clojure.core_every_pred_ep3__6441_fn__6442(this.p11, this.p22, this.p33), args4);
   } else {
    __r4187 = and__3966__auto__5;
   }
   __r4186 = __r4187;
  }
  return (clojure.lang.RT.booleanCast(((java.lang.Object)__r4186)) ? Boolean.TRUE : Boolean.FALSE);
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2, java.lang.Object z3) {
  Object __r4189 = null;
  {
   Object and__3966__auto__4 = ((IFn)this.p11).invoke(x1);
   Object __r4190;
   Object __r4191 = and__3966__auto__4;
   if (__r4191 != null && !(__r4191 == Boolean.FALSE)) {
    Object __r4192 = null;
    {
     Object and__3966__auto__5 = ((IFn)this.p22).invoke(x1);
     Object __r4193;
     Object __r4194 = and__3966__auto__5;
     if (__r4194 != null && !(__r4194 == Boolean.FALSE)) {
      Object __r4195 = null;
      {
       Object and__3966__auto__6 = ((IFn)this.p33).invoke(x1);
       Object __r4196;
       Object __r4197 = and__3966__auto__6;
       if (__r4197 != null && !(__r4197 == Boolean.FALSE)) {
        Object __r4198 = null;
        {
         Object and__3966__auto__7 = ((IFn)this.p11).invoke(y2);
         Object __r4199;
         Object __r4200 = and__3966__auto__7;
         if (__r4200 != null && !(__r4200 == Boolean.FALSE)) {
          Object __r4201 = null;
          {
           Object and__3966__auto__8 = ((IFn)this.p22).invoke(y2);
           Object __r4202;
           Object __r4203 = and__3966__auto__8;
           if (__r4203 != null && !(__r4203 == Boolean.FALSE)) {
            Object __r4204 = null;
            {
             Object and__3966__auto__9 = ((IFn)this.p33).invoke(y2);
             Object __r4205;
             Object __r4206 = and__3966__auto__9;
             if (__r4206 != null && !(__r4206 == Boolean.FALSE)) {
              Object __r4207 = null;
              {
               Object and__3966__auto__10 = ((IFn)this.p11).invoke(z3);
               Object __r4208;
               Object __r4209 = and__3966__auto__10;
               if (__r4209 != null && !(__r4209 == Boolean.FALSE)) {
                Object __r4210 = null;
                {
                 Object and__3966__auto__11 = ((IFn)this.p22).invoke(z3);
                 Object __r4211;
                 Object __r4212 = and__3966__auto__11;
                 if (__r4212 != null && !(__r4212 == Boolean.FALSE)) {
                  __r4211 = ((IFn)this.p33).invoke(z3);
                 } else {
                  __r4211 = and__3966__auto__11;
                 }
                 __r4210 = __r4211;
                }
                __r4208 = __r4210;
               } else {
                __r4208 = and__3966__auto__10;
               }
               __r4207 = __r4208;
              }
              __r4205 = __r4207;
             } else {
              __r4205 = and__3966__auto__9;
             }
             __r4204 = __r4205;
            }
            __r4202 = __r4204;
           } else {
            __r4202 = and__3966__auto__8;
           }
           __r4201 = __r4202;
          }
          __r4199 = __r4201;
         } else {
          __r4199 = and__3966__auto__7;
         }
         __r4198 = __r4199;
        }
        __r4196 = __r4198;
       } else {
        __r4196 = and__3966__auto__6;
       }
       __r4195 = __r4196;
      }
      __r4193 = __r4195;
     } else {
      __r4193 = and__3966__auto__5;
     }
     __r4192 = __r4193;
    }
    __r4190 = __r4192;
   } else {
    __r4190 = and__3966__auto__4;
   }
   __r4189 = __r4190;
  }
  return (clojure.lang.RT.booleanCast(((java.lang.Object)__r4189)) ? Boolean.TRUE : Boolean.FALSE);
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2) {
  Object __r4213 = null;
  {
   Object and__3966__auto__3 = ((IFn)this.p11).invoke(x1);
   Object __r4214;
   Object __r4215 = and__3966__auto__3;
   if (__r4215 != null && !(__r4215 == Boolean.FALSE)) {
    Object __r4216 = null;
    {
     Object and__3966__auto__4 = ((IFn)this.p22).invoke(x1);
     Object __r4217;
     Object __r4218 = and__3966__auto__4;
     if (__r4218 != null && !(__r4218 == Boolean.FALSE)) {
      Object __r4219 = null;
      {
       Object and__3966__auto__5 = ((IFn)this.p33).invoke(x1);
       Object __r4220;
       Object __r4221 = and__3966__auto__5;
       if (__r4221 != null && !(__r4221 == Boolean.FALSE)) {
        Object __r4222 = null;
        {
         Object and__3966__auto__6 = ((IFn)this.p11).invoke(y2);
         Object __r4223;
         Object __r4224 = and__3966__auto__6;
         if (__r4224 != null && !(__r4224 == Boolean.FALSE)) {
          Object __r4225 = null;
          {
           Object and__3966__auto__7 = ((IFn)this.p22).invoke(y2);
           Object __r4226;
           Object __r4227 = and__3966__auto__7;
           if (__r4227 != null && !(__r4227 == Boolean.FALSE)) {
            __r4226 = ((IFn)this.p33).invoke(y2);
           } else {
            __r4226 = and__3966__auto__7;
           }
           __r4225 = __r4226;
          }
          __r4223 = __r4225;
         } else {
          __r4223 = and__3966__auto__6;
         }
         __r4222 = __r4223;
        }
        __r4220 = __r4222;
       } else {
        __r4220 = and__3966__auto__5;
       }
       __r4219 = __r4220;
      }
      __r4217 = __r4219;
     } else {
      __r4217 = and__3966__auto__4;
     }
     __r4216 = __r4217;
    }
    __r4214 = __r4216;
   } else {
    __r4214 = and__3966__auto__3;
   }
   __r4213 = __r4214;
  }
  return (clojure.lang.RT.booleanCast(((java.lang.Object)__r4213)) ? Boolean.TRUE : Boolean.FALSE);
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  Object __r4228 = null;
  {
   Object and__3966__auto__2 = ((IFn)this.p11).invoke(x1);
   Object __r4229;
   Object __r4230 = and__3966__auto__2;
   if (__r4230 != null && !(__r4230 == Boolean.FALSE)) {
    Object __r4231 = null;
    {
     Object and__3966__auto__3 = ((IFn)this.p22).invoke(x1);
     Object __r4232;
     Object __r4233 = and__3966__auto__3;
     if (__r4233 != null && !(__r4233 == Boolean.FALSE)) {
      __r4232 = ((IFn)this.p33).invoke(x1);
     } else {
      __r4232 = and__3966__auto__3;
     }
     __r4231 = __r4232;
    }
    __r4229 = __r4231;
   } else {
    __r4229 = and__3966__auto__2;
   }
   __r4228 = __r4229;
  }
  return (clojure.lang.RT.booleanCast(((java.lang.Object)__r4228)) ? Boolean.TRUE : Boolean.FALSE);
 }
 public java.lang.Object invoke() {
  return Boolean.TRUE;
 }
 public int getRequiredArity() {
  return 3;
 }
}

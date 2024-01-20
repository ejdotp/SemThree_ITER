----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date: 12/23/2023 02:14:03 PM
-- Design Name: 
-- Module Name: BCD9sCompliment_tb - dataflow
-- Project Name: 
-- Target Devices: 
-- Tool Versions: 
-- Description: 
-- 
-- Dependencies: 
-- 
-- Revision:
-- Revision 0.01 - File Created
-- Additional Comments:
-- 
----------------------------------------------------------------------------------


library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--use IEEE.NUMERIC_STD.ALL;

-- Uncomment the following library declaration if instantiating
-- any Xilinx leaf cells in this code.
--library UNISIM;
--use UNISIM.VComponents.all;

entity BCD9sCompliment_tb is
--  Port ( );
end BCD9sCompliment_tb;
--E. JAGADEESWAR PATRO-2241016309;
architecture dataflow of BCD9sCompliment_tb is
component BCD9sCompliment
port(A, B, C, D: in std_logic;
     P, Q, R, S: out std_logic);
end component;
signal A, B, C, D: std_logic;
signal P, Q, R, S: std_logic;
begin
uut: BCD9sCompliment port map(A => A, B => B, C => C, D => D, P => P, Q => Q, R => R, S => S);
stimulus: process
begin
A <= '0'; B <= '0'; C <= '0'; D <= '0'; wait for 10ns;
A <= '0'; B <= '0'; C <= '0'; D <= '1'; wait for 10ns;
A <= '0'; B <= '0'; C <= '1'; D <= '0'; wait for 10ns;
A <= '0'; B <= '0'; C <= '1'; D <= '1'; wait for 10ns;
A <= '0'; B <= '1'; C <= '0'; D <= '0'; wait for 10ns;
A <= '0'; B <= '1'; C <= '0'; D <= '1'; wait for 10ns;
A <= '0'; B <= '1'; C <= '1'; D <= '0'; wait for 10ns;
A <= '0'; B <= '1'; C <= '1'; D <= '1'; wait for 10ns;
A <= '1'; B <= '0'; C <= '0'; D <= '0'; wait for 10ns;
A <= '1'; B <= '0'; C <= '0'; D <= '1'; wait for 10ns;
end process;
end dataflow;
